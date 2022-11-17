package com.openbootcamp.java.advanced.functional;

import java.util.function.Function;

public class Funcionales {

    // Funciones lambda
    private final Function<String,String> toMayus = String::toUpperCase;
    private final Function<Integer,Integer> sumador = x -> Integer.sum(x, x);

    public void pruebas() {
        saluda(toMayus, "Victor");
        //System.out.println(toMayus.apply("Victor"));
        System.out.println(sumador.apply(5));
    }

    public void saluda(Function<String,String> miFuncion, String nombre) {
        System.out.println(miFuncion.apply(nombre));
    }

}
