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
 
        // NAin
        Melodia equipo1 = new Melodia("Melodia Equipo 1")
            .instrumento(Instrumento.GUITARRA_NYLON)
            .nota(Nota.DO, Figura.NEGRA)
            .nota(Nota.MI, Figura.CORCHEA)
            .nota(Nota.SOL, Figura.CORCHEA); // add more notes as needed
        melodias.add(equipo1);
 
        //Andres
        Melodia Andresmelodia = new Melodia("Melodia Equipo 2")
                .instrumento(Instrumento.FLAUTA)
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
                .nota(Nota.SOL, Figura.BLANCA);
            melodias.add(Andresmelodia);
        
      
 
        // Return the list
        return melodias;
    }
}
 
