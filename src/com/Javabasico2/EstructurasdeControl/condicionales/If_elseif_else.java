package com.Javabasico2.EstructurasdeControl.condicionales;

public class If_elseif_else {
    public static void main(String[] args) {

        String dia = "Lunesito";
        // Ejemplos comparativos
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        // if else if
        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana Tochera champion");
        } else if (dia.equals("Martes")) {
            System.out.println("Martes de Champions");
        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles de Champions");
        } else if (dia.equals("Jueves")) {
            System.out.println("Jueves de pre");
        } else if (dia.equals("Viernes")) {
            System.out.println("Viernes de Tocho");
        } else if (dia.equals("Sabado")) {
            System.out.println("Sabado de descanso");
        } else if (dia.equals("Domingo")) {
            System.out.println("Domingo de Tocho");
        } else {
            System.out.println("No es día de la semana");
        }

    }
}

