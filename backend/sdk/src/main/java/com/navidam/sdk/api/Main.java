package com.navidam.sdk.api;

import com.navidam.sdk.api.plantilla.ModeloPlantillaPrueba;
import com.navidam.sdk.internal.html.HtmlRenderer;
import com.navidam.sdk.internal.melodia.Melodia;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("🎄 NAVIDAM SDK - PRUEBAS 🎄\n");
        
        NaviDAMAPI api = new NaviDAMAPI();
        HtmlRenderer renderer = new HtmlRenderer();
        
        
        System.out.println("🎵 MELODÍAS REGISTRADAS:");
        List<Melodia> melodias = api.listadoMelodias();
        for (int i = 0; i < melodias.size(); i++) {
            System.out.println("  " + (i+1) + ". " + melodias.get(i).titulo());
        System.out.println("\n📄 PLANTILLAS REGISTRADAS:");
        api.listadoPlantillas().forEach(p -> 
            System.out.println("  • " + p.getTitulo())
        );
        
  
        System.out.println("\n🖨️ RENDERIZANDO PLANTILLA...");
        
        ModeloPlantillaPrueba modelo = new ModeloPlantillaPrueba(
            "Ana",
            "Carlos",
            "¡Feliz Navidad! 🎄 Que tengas un año genial lleno de alegría, paz y momentos inolvidables junto a tus seres queridos.",
            "Feliz Navidad (Campanas)",
            LocalDateTime.now()
        );
        
     
        Path demoPath = renderer.renderToFile(
            "demo",  
            modelo,
            Path.of("out/demo.html")
        );
        System.out.println("✓ Plantilla generada en: " + demoPath.toAbsolutePath());
        
        System.out.println("\n✨ ¡PRUEBAS COMPLETADAS! ✨");
    }
}
}