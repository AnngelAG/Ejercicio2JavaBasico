package com.Javabasico2;
/**
 * Sobre carga permite duplicar un método siempre y cuando tenga diferente numero / tipo paramentros.
 * **/
public class Sobrecarga {
    public static void main(String[] args) {

    }
    static double suma(double a, double b) {
        return a + b;
    }
    static int suma(int a, int b) {
        return a + b;
    }
    static int suma(int a, int b,int c) {
        return a + b;
    }

}
