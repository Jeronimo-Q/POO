package com.jeronimo.banco.dominio;

public class CuentaBancaria {
    // Atributos
    public String numero;
    public Persona propietario;
    public double saldo;
    public double TasaInteres;
    public String tipo;
    public Banco banco;

    //Constructores
    public CuentaBancaria(String numero){
        this.numero = numero;
    }

    public CuentaBancaria(String numero, Persona propietario, Banco banco) {
        this.numero = numero;
        this.propietario = propietario;
        this.banco = banco;
    }

    // Metodos
    public void consignar(int valorAConsignar) {
        this.saldo = this.saldo+valorAConsignar;
    }

    public boolean retirar(int valorARetirar) {
        if (valorARetirar <= this.saldo){
            this.saldo -= valorARetirar;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public boolean transferir(int vaorATrans, CuentaBancaria otraCuenta) {
        if (vaorATrans <= this.saldo){
            this.saldo -= vaorATrans;
            otraCuenta.consignar(vaorATrans);
            return true;
        }else{
            System.out.println("Saldo insuficiente a la transferencia");
            return false;
        }
    }

    public  void mostrarSaldo(){
        System.out.println("El saldo es $ "+this.saldo);
    }
}
