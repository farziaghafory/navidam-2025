package com.navidam.sdk.api;

import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;
import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;

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

        // Mine melody
        Melodia demo = new Melodia("Demo Melody")
            .instrumento(Instrumento.PIANO_ACUSTICO)
            .nota(Nota.DO, Figura.NEGRA)
            .nota(Nota.MI, Figura.CORCHEA)
            .nota(Nota.SOL, Figura.CORCHEA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.RE, Figura.BLANCA);

        melodias.add(demo);

        // NAin y Andress:
        // melodias.add(new MelodiaEquipo2()...);
        // melodias.add(new MelodiaEquipo3()...);

        return melodias;
    }
}
