package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        double total = obtenerTotal(200, 16.8);
        System.out.println(total);
    }

    static double obtenerTotal(double precio, double iva){
        return precio + iva;
    }
}
