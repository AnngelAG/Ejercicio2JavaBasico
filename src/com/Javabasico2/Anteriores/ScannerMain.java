package com.Javabasico2.Anteriores;
import java.util.Scanner;
public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un Nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El nombre introducido es: " + numero);

        System.out.println("Hola Mundo");
    }
}
