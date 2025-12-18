import { createBrowserRouter } from "react-router-dom";
import PageNotFound from "@/pages/PageNotFound.tsx";
import { Index } from "@/pages/Index";
import { AltaPersona } from "@/pages/AltaPersona";
import { Personas } from "@/pages/Personas";
import { Postal } from "@/pages/Postal";


export const router = createBrowserRouter([
    { path: "*", element: <PageNotFound /> },
    { path: "/index", element: <Index /> },
    { path: "/AltaPersona", element: <AltaPersona /> },
    { path: "/Personas", element: <Personas /> },
    { path: "/Postal", element: <Postal /> },

]);