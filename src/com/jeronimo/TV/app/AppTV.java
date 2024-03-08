package com.jeronimo.TV.app;

import com.jeronimo.TV.dominio.TV;

public class AppTV {
    public static void main(String[]args){
        TV miTV = new TV();

        miTV.volumen= 30;
        miTV.puerto = "HDMI";
        miTV.canal = 300;
        miTV.encendido = false;
        miTV.resolucion = "4k";

        miTV.encender();
        miTV.bajarVolumen();
        miTV.cambiarPuerto("AV1");
        miTV.pasarCanal(500);
        miTV.cambiarResolucion("4k full HD");
        miTV.conectar();
        miTV.navegar();
        miTV.configuracion();
    }
}
