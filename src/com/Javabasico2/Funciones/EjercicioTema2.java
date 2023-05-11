package com.Javabasico2.Funciones;

public class EjercicioTema2 {
    public static void main(String[] args) {
        double price = 100.00;
       double precioMasIVA =  precioMasIVA(price);
        System.out.println("El precio mas 16% de IVA es de  "+ precioMasIVA);
    }

    private static double precioMasIVA(double price) {
        return price * 1.16;
    }
}
