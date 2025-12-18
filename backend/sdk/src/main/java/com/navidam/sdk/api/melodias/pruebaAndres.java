package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;

public class pruebaAndres {

	public static void main(String[] args) {
		try {
			new Melodia("Melodia prueba andres").instrumento(Instrumento.BAJO_FRETLESS)

            
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.MI, Figura.BLANCA)

            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.MI, Figura.BLANCA)

            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.SOL, Figura.NEGRA)
            .nota(Nota.DO, Figura.NEGRA)
            .nota(Nota.RE, Figura.NEGRA)
            .nota(Nota.MI, Figura.BLANCA)

            
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.FA, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.RE, Figura.NEGRA)
            .nota(Nota.RE, Figura.NEGRA)
            .nota(Nota.MI, Figura.NEGRA)
            .nota(Nota.RE, Figura.NEGRA)
            .nota(Nota.SOL, Figura.BLANCA)

            .escuchar();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
