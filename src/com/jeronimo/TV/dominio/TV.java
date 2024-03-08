package com.jeronimo.TV.dominio;


public class TV {

    //Atributos

    public String marca;
    public String tamaño;
    public String resolucion;
    public int volumen;
    public int canal;
    public boolean encendido;
    public String puerto;
    public boolean conexionInternet;
    public Aplicacion aplicacion;

    //Contructores

    public TV(String marca, String resolucion, boolean conexionInternet) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.conexionInternet = conexionInternet;
    }


    //Metodos

    public void encender(){this.encendido = true;}

    public  void apagar(){this.encendido = false;}

    public void pasarCanal(int canalACambiar){this.canal = canalACambiar;}

    public void subirVolumen(){this.volumen += 1;}

    public void bajarVolumen(){this.volumen -= 1;}

    public void cambiarPuerto(String puertoACambiar){this.puerto = puertoACambiar; }

    public void cambiarResolucion(String resolucionACambiar){this.resolucion = resolucionACambiar; }

    public void conectar(){this.conexionInternet = true;}

    public void navegar(){
        if(this.conexionInternet){
        } else{
            System.out.println("No te encuentras conectado a internet");
        }
    }

    public void configuracion(){System.out.println(this.encendido+"\n"+ this.volumen +"\n"+ this.canal +"\n"+this.puerto+"\n"+this.resolucion+"\n"+this.conexionInternet);
    }
}