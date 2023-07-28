package org.example.ejamplo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digita la temperatura actual");
        Double temperatura= teclado.nextDouble();
        String temperaturaTex=temperatura.toString();
        switch (temperaturaTex){
            case "20.0":
                temperatura=25.0;
                break;
            case "30.0":
                temperatura=20.0;
                break;
            case "40.0":
                temperatura=20.0;
                break;
            default:
                System.out.println("digite la temperatura que desea");





        }
    }
}
