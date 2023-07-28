package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in);
        Double temperaturaAmbiente;
        System.out.println("ingrese la temperatura ambiente");
        temperaturaAmbiente= teclado.nextDouble();
        if (temperaturaAmbiente== 20.0){
         temperaturaAmbiente=25.0;

        } else if (temperaturaAmbiente==30.0) {
            temperaturaAmbiente=20.0;
        }else if (temperaturaAmbiente==40.0) {
            temperaturaAmbiente = 20.0;
        }else {
            System.out.println("señor usuario ingrese temperatura");
            temperaturaAmbiente=teclado.nextDouble();
        }
        System.out.println("apreciado usuario su temperatura cambio a " + temperaturaAmbiente);
        // switch ==>  evaluar estados

    }
}