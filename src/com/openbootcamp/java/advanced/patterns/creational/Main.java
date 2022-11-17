package com.openbootcamp.java.advanced.patterns.creational;

public class Main {

    public static void main(String[] args) {
        PrecioFactory precioFactory = new PrecioFactory("españa");
        PrecioFactory precioFactory1 = new PrecioFactory("usa");

        System.out.println("Precio españa: " + precioFactory.getPrecio());
        System.out.println("Precio usa: " + precioFactory1.getPrecio());
    }
}
