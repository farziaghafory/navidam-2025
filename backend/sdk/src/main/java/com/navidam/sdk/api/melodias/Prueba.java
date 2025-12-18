package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;

public class Prueba {
    public static void main(String[] args) {
        try {
            new Melodia("Demo Melody")
                .instrumento(Instrumento.PIANO_ACUSTICO)
                .nota(Nota.DO, Figura.NEGRA)
                .nota(Nota.MI, Figura.CORCHEA)
                .nota(Nota.SOL, Figura.CORCHEA)
                .nota(Nota.FA, Figura.NEGRA)
                .nota(Nota.RE, Figura.BLANCA)
                .escuchar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

