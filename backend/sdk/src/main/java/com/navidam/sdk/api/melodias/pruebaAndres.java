package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;

public class pruebaAndres {
    
    public static Melodia crear() {
        return new Melodia("Feliz Navidad")
        		.instrumento(Instrumento.PIANO_ACUSTICO)
            .tempo(140)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.LA, Figura.NEGRA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .silencio(Figura.NEGRA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.LA, Figura.NEGRA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .silencio(Figura.NEGRA);
    }
}
