package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;
 
public class NainMelodia {
	public static void main(String[] args) {
 
 
			try {
            new Melodia("Melodia")
                .instrumento(Instrumento.PIANO_ACUSTICO)

                .nota(Nota.DO, Figura.NEGRA)
                .nota(Nota.MI, Figura.NEGRA)
                .nota(Nota.SOL, Figura.NEGRA)
                .nota(Nota.DO, Figura.BLANCA)
                // Compás 2 (arpegio FA mayor)
                .nota(Nota.FA, Figura.NEGRA)
                .nota(Nota.LA, Figura.NEGRA)
                .nota(Nota.DO, Figura.NEGRA)
                .nota(Nota.FA, Figura.BLANCA)
                // Compás 3 (arpegio SOL mayor)
                .nota(Nota.SOL, Figura.NEGRA)
                .nota(Nota.SI, Figura.NEGRA)
                .nota(Nota.RE, Figura.NEGRA)
                .nota(Nota.SOL, Figura.BLANCA)
                // Compás 4 (resuelve a DO)
                .nota(Nota.MI, Figura.NEGRA)
                .nota(Nota.DO, Figura.NEGRA)
                .nota(Nota.SOL, Figura.NEGRA)
                .nota(Nota.DO, Figura.REDONDA);

            PistaPIANO_ACUSTICO.escuchar();
			} catch (Exception e) {
                       e.printStackTrace();
        }
 
	}
}
