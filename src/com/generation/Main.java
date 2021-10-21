package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;

public class Main {

    public static int numerador = 10;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {

        try {
            System.out.println("Antes de hacer la division");
            division = numerador / denominador;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Despues de la division");

//        Persona persona = new Persona();
//        persona.nombre = "Emmanuel";
//        persona.edad = 99;

//        CuentaBancaria cuenta = new CuentaBancaria();
//        cuenta.setNombre("Emmanuel");
//        cuenta.setClave("ABCD-1234");
//        cuenta.setSaldo(19999);
//        cuenta.mostrarSaldo();

//        Animal animal = new Animal();
//        animal.nombre = "Oso panda";

        Persona persona= new Persona();
        persona.setName("Santiago");
        persona.setAge(33);
        persona.setId("102045455");
        persona.mostrarPersona();
    }
}
