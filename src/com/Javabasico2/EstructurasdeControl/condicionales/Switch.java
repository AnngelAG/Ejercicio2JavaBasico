package com.Javabasico2.EstructurasdeControl.condicionales;

public class Switch {
    public static void main(String[] args) {

    String dia = "Lunes";
    switch (dia) {
        case "Lunes":
            System.out.println("Hoy es lunes!! Animo");
            break;
        case "Martes":
            System.out.println("Hoy es Martes!! Relax");
            break;
        case "Miercoles":
            System.out.println("Hoy es Martes!! Relax");
            break;
        case "Juves":
            System.out.println("Hoy es Martes!! Relax");
            break;
        case "Viernes":
            System.out.println("Hoy es Martes!! Relax");
            break;
        case "Sabado":
            System.out.println("Hoy es Martes!! Relax");
            break;
        case "Domingo":
            System.out.println("Hoy es Martes!! Relax");
            break;
        default:
            System.out.println("No es un día valido");
            break;
    }

    }
}
