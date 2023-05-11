package com.Javabasico2.Anteriores;

import java.util.Scanner;
public class ThrowMain {
    public static void main(String[] args) {
        try {
            leerNombres();
        }catch (NameFormatException e) {
            e.printStackTrace();
        }
    }
    /**
     * Metrodo que lee nombres de consola y verifica que tengan longitud igual o mayor que 8 caracteres
     * @thows MameFormatException
     */
    private static void leerNombres() throws NameFormatException{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        while (teclado.hasNext()){
            System.out.println("Introduce nombre");
            String nombre = teclado.nextLine();
        if(nombre.length() > 8){
            teclado.close();
            throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
            }
        }
        teclado.close();
    }
}
