package com.jeronimo.cafetera.dominio;

public class Cafetera {
    //Atributos
    public double capacidad;
    public boolean encendido;
    public double temperatura;
    public double presion;

    //Metodos
    public void encender(){this.encendido=true;}

    public void apagar(){this.encendido=false;}

}
