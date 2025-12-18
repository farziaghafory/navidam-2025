package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;

public class Prueba{
	 public static Melodia crear() {
	        return new Melodia("Melodia de Nain")
	            .instrumento(Instrumento.PIANO_ACUSTICO)
            .tempo(120)
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
    }
}