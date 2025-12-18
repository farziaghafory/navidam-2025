package com.navidam.sdk.api;

import com.navidam.sdk.api.plantilla.ModeloPlantillaPrueba;
import com.navidam.sdk.internal.html.HtmlRenderer;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ModeloPlantillaPrueba modelo = new ModeloPlantillaPrueba(
            "Ana",
            "Carlos",
            "¡Feliz Navidad! 🎄 Que tengas un año genial.",
            "La vaca Lola",
            LocalDateTime.now()
        );

        List<ModeloPlantillaPrueba> mensajes = List.of(modelo);

        HtmlRenderer renderer = new HtmlRenderer();
        Path salida = renderer.renderToFile(
            "demo",               
            modelo,               
            Path.of("out/demo-rendered.html")
        );

        System.out.println("HTML generado en: " + salida.toAbsolutePath());
    }
}
