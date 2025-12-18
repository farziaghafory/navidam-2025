package com.navidam.sdk.api;

import com.navidam.sdk.api.melodias.*;
import com.navidam.sdk.api.plantilla.*;
import com.navidam.sdk.internal.melodia.Melodia;
import com.navidam.sdk.internal.html.Plantilla;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NaviDAMAPI {
    
    public List<Melodia> listadoMelodias() {
        return List.of(
            Prueba.crear(),     
            NainMelodia.crear(),      
            pruebaAndres.crear()      
        );
    }
    
    public List<Plantilla> listadoPlantillas() {
        return List.of(
            DemoPlantilla.crear()  
        );
    }
    
    public List<ModeloPlantillaPrueba> listadoMensajes() {
        List<ModeloPlantillaPrueba> mensajes = new ArrayList<>();
        List<Melodia> melodias = listadoMelodias();

        if (!melodias.isEmpty()) {
            mensajes.add(new ModeloPlantillaPrueba(
                "Ana",
                "Carlos",
                "¡Feliz Navidad! 🎄 Que tengas un año genial lleno de alegría y éxitos.",
                melodias.get(0).titulo(),
                LocalDateTime.of(2025, 12, 17, 18, 18)
            ));
        }

        if (melodias.size() > 1) {
            mensajes.add(new ModeloPlantillaPrueba(
                "Luis",
                "Suarez",
                "¡Felices fiestas! 🎄 Que la magia de la Navidad llene tu hogar de amor y paz.",
                melodias.get(1).titulo(),
                LocalDateTime.of(2025, 12, 17, 18, 20)
            ));
        }

        if (melodias.size() > 2) {
            mensajes.add(new ModeloPlantillaPrueba(
                "María",
                "Equipo NaviDAM",
                "¡Brindemos por un nuevo año lleno de aprendizaje y crecimiento! 🥂",
                melodias.get(2).titulo(),
                LocalDateTime.now()
            ));
        }

        return mensajes;
    }
    
    
    public String generarMemeNavidad() {
        
        return "https://api.memegen.link/images/gru/Cuando_es_Nochebuena/y_todavía_no_has/comprado_los_regalos/😱_🎁_🏃‍♂️.png?width=600";
    }
    
    public String generarMemeExamenes() {
        return "https://api.memegen.link/images/drake/Estudiar_para_exámenes_de_enero/Disfrutar_las_vacaciones_de_navidad.png?width=500";
    }
    
    public String generarMemeAprobado() {
        return "https://api.memegen.link/images/captain/Yo/Preparándome_para_la_hackathon/Entregando_el_proyecto_a_tiempo.png?width=600";
    }
}