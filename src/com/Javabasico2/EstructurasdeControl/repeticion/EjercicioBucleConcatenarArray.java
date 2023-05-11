package com.Javabasico2.EstructurasdeControl.repeticion;

public class EjercicioBucleConcatenarArray {
    public static void main(String[] args) {
      String nombres [] = {"Angel","Jesus","Andrade","Garcia"};
      String nombrecompleto = "";
        for (int i = 0; i < nombres.length; i++) {
           nombrecompleto += nombres[i]+" ";
      }
        System.out.println(nombrecompleto);

    }
}
