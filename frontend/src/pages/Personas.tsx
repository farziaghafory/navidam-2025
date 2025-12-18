"use client";

import { Footer } from "@/components/Footer";
import Header from "@/components/Header";
import { useEffect, useMemo, useState } from "react";

// Definimos el tipo de dato acorde a tu Entity de Java
interface Persona {
    id: number;
    nombre: string;
    email: string;
}

export function Personas() {
    const [personas, setPersonas] = useState<Persona[]>([]);
    const [busqueda, setBusqueda] = useState<string>("");
    const [cargando, setCargando] = useState<boolean>(true);

    useEffect(() => {
        cargarDatos();
    }, []);

    const cargarDatos = () => {
        setCargando(true);
        fetch("http://localhost:8080/personas?ordenarPor=nombre&direccion=ASC")
            .then((response) => response.json())
            .then((data) => {
                setPersonas(data);
                setCargando(false);
            })
            .catch((error) => {
                console.error("Error cargando personas:", error);
                setCargando(false);
            });
    };

    const personasFiltradas = useMemo(() => {
        if (!busqueda) return personas;

        return personas.filter((p) =>
            p.nombre.toLowerCase().includes(busqueda.toLowerCase()) ||
            p.email.toLowerCase().includes(busqueda.toLowerCase())
        );
    }, [busqueda, personas]);

    const handleDelete = async (id: number) => {
        if (!confirm("¿Estás seguro de eliminar a esta persona?")) return;

        try {
            const response = await fetch(`http://localhost:8080/personas/${id}`, {
                method: "DELETE",
            });

            if (response.ok) {
                setPersonas((prev) => prev.filter((persona) => persona.id !== id));
                alert("Persona eliminada correctamente");
            } else {
                alert("Error al eliminar en el servidor");
            }
        } catch (error) {
            console.error("Error en la petición DELETE:", error);
        }
    };

    return (
        <>
            <Header />

            <main className="max-w-6xl mx-auto px-4 py-10">
                <div className="rounded-[2rem] bg-white text-slate-900 shadow-2xl ring-1 ring-black/5 overflow-hidden">
                    <div className="p-6 md:p-10">
                        <div className="flex flex-col md:flex-row md:items-end md:justify-between gap-4 mb-6">
                            <div>
                                <h1 className="text-2xl font-black tracking-tight">Personas registradas</h1>
                                <p className="text-slate-600 text-sm mt-1">
                                    Elimina personas directamente desde el listado.
                                </p>
                            </div>

                            <div className="flex gap-2">
                                <input
                                    value={busqueda}
                                    onChange={(e) => setBusqueda(e.target.value)}
                                    className="w-full md:w-80 px-4 py-2.5 rounded-2xl bg-white border border-slate-200 outline-none focus:ring-2 focus:ring-red-300"
                                    placeholder="Buscar por nombre o email"
                                />
                                <button
                                    onClick={cargarDatos}
                                    className="px-4 py-2.5 rounded-2xl bg-slate-900 hover:bg-slate-800 text-white font-semibold transition-colors"
                                    title="Recargar lista"
                                >
                                    {cargando ? "..." : "🔄"}
                                </button>
                            </div>
                        </div>

                        <section className="rounded-3xl border border-slate-200 overflow-hidden">
                            <div className="p-4 md:p-6 flex items-center justify-between bg-slate-50">
                                <p className="text-sm text-slate-700">Listado</p>
                                <span className="text-xs font-bold text-slate-500">
                                    Total: {personasFiltradas.length}
                                </span>
                            </div>

                            {personasFiltradas.length > 0 ? (
                                <div className="overflow-x-auto">
                                    <table className="w-full text-sm">
                                        <thead className="bg-slate-50 text-slate-600">
                                            <tr>
                                                <th className="text-left px-4 py-3">Nombre</th>
                                                <th className="text-left px-4 py-3">Email</th>
                                                <th className="text-left px-4 py-3 w-[340px]">Acciones</th>
                                            </tr>
                                        </thead>

                                        <tbody className="divide-y divide-slate-200">
                                            {personasFiltradas.map((persona) => (
                                                <tr key={persona.id} className="hover:bg-slate-50 transition-colors">
                                                    <td className="px-4 py-3">
                                                        <div className="flex items-center gap-3">
                                                            <div className="h-9 w-9 rounded-2xl bg-slate-100 border border-slate-200 flex items-center justify-center">
                                                                <span>👤</span>
                                                            </div>
                                                            <div>
                                                                <p className="font-semibold">{persona.nombre}</p>
                                                                <p className="text-xs text-slate-500">ID: {persona.id}</p>
                                                            </div>
                                                        </div>
                                                    </td>

                                                    <td className="px-4 py-3 text-slate-700">{persona.email}</td>

                                                    <td className="px-4 py-3">
                                                        <div className="flex flex-wrap gap-2">
                                                            <button
                                                                onClick={() => handleDelete(persona.id)}
                                                                className="px-3 py-2 rounded-xl bg-white hover:bg-red-50 hover:text-red-700 hover:border-red-200 border border-slate-200 font-semibold text-slate-900 transition-all"
                                                            >
                                                                🗑️ Eliminar
                                                            </button>
                                                        </div>
                                                    </td>
                                                </tr>
                                            ))}
                                        </tbody>
                                    </table>
                                </div>
                            ) : (
                                <div className="p-10 text-center text-slate-500">
                                    {cargando
                                        ? "Cargando datos..."
                                        : "No hay personas registradas (o no coinciden con la búsqueda)"
                                    }
                                </div>
                            )}
                        </section>
                    </div>
                </div>
            </main>

            <Footer />
        </>
    );
}