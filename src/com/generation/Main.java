package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
//        Persona persona = new Persona();
//        persona.nombre = "Emmanuel";
//        persona.edad = 99;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Emmanuel");
        cuenta.setClave("ABCD-1234");
        cuenta.setSaldo(19999);
        cuenta.mostrarSaldo();

//        Animal animal = new Animal();
//        animal.nombre = "Oso panda";

        Persona persona= new Persona();
        persona.setName("Santiago");
        persona.setAge(33);
        persona.setId("102045455");
        persona.mostrarPersona();
    }
}
