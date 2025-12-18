package com.navidam.sdk.api.melodias;

import com.navidam.sdk.internal.melodia.Figura;
import com.navidam.sdk.internal.melodia.Instrumento;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.melodia.Nota;

public class Prueba {

	public static void main(String[] args) {
		try {
			new Melodia("CAncion de prueba").instrumento(Instrumento.BAJO_FRETLESS)
				.nota(Nota.FA, Figura.NEGRA)
				.nota(Nota.LA, Figura.BLANCA).escuchar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
