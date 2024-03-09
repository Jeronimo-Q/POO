package com.jeronimo.banco.app;

import com.jeronimo.banco.dominio.Banco;
import com.jeronimo.banco.dominio.CuentaBancaria;
import com.jeronimo.banco.dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {
        Banco bancolombia  = new Banco("Bancolombia SA");
        Persona alex = new Persona("Alexander");
        CuentaBancaria miCuenta = new CuentaBancaria("12345", alex, bancolombia);

        Persona Roberto = new Persona("Roberto");
        CuentaBancaria vanessaCuenta = new CuentaBancaria("123",Roberto,bancolombia);
        //vanessaCuenta.propietario = new Persona("Vanessa");
        //vanessaCuenta.banco = new Banco("Banco de Bogota");

        System.out.println("Numero cuenta : "+miCuenta.propietario.nombre);
        System.out.println("Cuenta de Vanessa : "+vanessaCuenta.propietario.nombre);

//        miCuenta.consignar(100000);
//        miCuenta.retirar(50000);
//        miCuenta.transferir(10000, vanessaCuenta);
//        miCuenta.mostrarSaldo();
//        System.out.println("Cuenta de Vanessa");
//        vanessaCuenta.mostrarSaldo();
    }
}
