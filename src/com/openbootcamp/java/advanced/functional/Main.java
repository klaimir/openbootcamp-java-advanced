package com.openbootcamp.java.advanced.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Uso de High Order functions
        Funcionales f = new Funcionales();
        f.pruebas();

        System.out.println(suma(4,5));

        // Streams
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Manolo");
        nombres.add("Juan");

        // Forma funcional de recorrer el ArrayList
        nombres.stream().forEach(nombre -> System.out.println(nombre));

        // Mapeo y filtrado
        Stream<String> valores = nombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .filter(nombre -> nombre.startsWith("M"));

        valores.forEach(nombre -> System.out.println(nombre));
        // Una vez utilizado el stream ya no se puede reutilizar. La siguiente línea lanzará excepción
        //valores.forEach(nombre -> System.out.println(nombre));

        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var stNumeros = Arrays.stream(numeros);

        // Mapeo y filtrado
        // Al poner var el compilador determinar en tiempo de ejecución su tipo
        var resultados = stNumeros.filter(x -> x % 2 == 0);
        resultados.forEach(x -> System.out.println(x));

        // Reduce
        var stNumeros2 = Arrays.stream(numeros);
        int resultado = stNumeros2.reduce(0, (x , y) -> x + y);
        System.out.println("Resultado reduce: " + resultado);
    }

    // Función pura
    public static int suma(int a, int b) {
        return a + b;
    }
}