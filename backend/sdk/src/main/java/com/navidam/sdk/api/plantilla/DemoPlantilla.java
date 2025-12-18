package com.navidam.sdk.api.plantilla;
import com.navidam.sdk.internal.html.Plantilla;

public class DemoPlantilla {

    public static Plantilla crear() {
        return new Plantilla("Demo navidad") 
                .path("demo");              
    }
}
