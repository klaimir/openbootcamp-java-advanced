package com.openbootcamp.java.advanced.patterns.creational;

public class PrecioFactory {

    Precio precio;

    private PrecioFactory() {};

    public PrecioFactory(String pais) {
        if(pais.equalsIgnoreCase("España")) {
            precio = new PrecioEUR();
        } else {
            precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}
