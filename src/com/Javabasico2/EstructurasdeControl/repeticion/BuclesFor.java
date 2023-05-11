package com.Javabasico2.EstructurasdeControl.repeticion;

public class BuclesFor {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < 10; i++) {
            //System.out.println("Hola Mundo" + i);
        }
        String[] nombres = {"Pepe","Juanito","Ruperta"}; // lenth 3
        for (int i = 0; i < nombres.length; i++){
           // System.out.println(i +" "+nombres[i]);
        }
        int suma = 0;
        int[] numeros = {5,7,8}; // Length 3
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
            System.out.println(suma);
        }
    }
}
