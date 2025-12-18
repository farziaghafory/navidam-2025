package com.navidam.sdk.api;

import com.navidam.sdk.api.plantilla.ModeloPlantillaPrueba;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;
import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NaviDAMAPI {

    private static NaviDAMAPI instance;

    public static NaviDAMAPI getInstance() {
        if (instance == null) {
            instance = new NaviDAMAPI();
        }
        return instance;
    }

   
    public List<Melodia> listadoMelodias() {
        List<Melodia> melodias = new ArrayList<>();

        // My melody
        Melodia demo = new Melodia("Demo Melody")
            .instrumento(Instrumento.PIANO_ACUSTICO)
            .nota(Nota.LA, Figura.NEGRA)
            .nota(Nota.RE, Figura.CORCHEA)
            .nota(Nota.MI, Figura.CORCHEA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.MI, Figura.BLANCA)
            .nota(Nota.LA, Figura.NEGRA)
            .nota(Nota.RE, Figura.CORCHEA)
            .nota(Nota.MI, Figura.CORCHEA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.MI, Figura.BLANCA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.RE, Figura.NEGRA)
            .nota(Nota.LA, Figura.NEGRA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA);

        melodias.add(demo);

        // Nain
        Melodia equipo1 = new Melodia("Melodia Equipo 1")
            .instrumento(Instrumento.GUITARRA_NYLON)
            .nota(Nota.DO, Figura.NEGRA)
            .nota(Nota.MI, Figura.CORCHEA)
            .nota(Nota.SOL, Figura.CORCHEA);
        melodias.add(equipo1);

        // Alonso
        Melodia equipo2 = new Melodia("Melodia Equipo 2")
            .instrumento(Instrumento.PIANO_ACUSTICO)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.LA, Figura.CORCHEA)
            .nota(Nota.SI, Figura.CORCHEA);
        melodias.add(equipo2);

        return melodias;
    }
// List of melodies
    public List<ModeloPlantillaPrueba> listadoMensajes() {
        List<ModeloPlantillaPrueba> mensajes = new ArrayList<>();
        List<Melodia> melodias = listadoMelodias();

        if (!melodias.isEmpty()) {
            Melodia m1 = melodias.get(0);
            mensajes.add(new ModeloPlantillaPrueba(
                    "Ana",
                    "Carlos",
                    "¡Feliz Navidad! Gracias por este año :)",
                    m1.titulo(),
                    LocalDateTime.of(2025, 12, 17, 18, 18)
            ));
        }

        if (melodias.size() > 1) {
            Melodia m2 = melodias.get(1);
            mensajes.add(new ModeloPlantillaPrueba(
                    "Luis",
                    "María",
                    "¡Felices fiestas! 🎄",
                    m2.titulo(),
                    LocalDateTime.of(2025, 12, 17, 18, 20)
            ));
        }

        return mensajes;
    }
}
