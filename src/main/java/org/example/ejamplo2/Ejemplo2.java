package org.example.ejamplo2;

public class Ejemplo2 {
    public static void main(String[] args) {
        int variableEstado=0;
        switch (variableEstado){
            case 0:
                System.out.println("el camino se fue por el cero");
                break;
            case 10:
                System.out.println("el camino se fue por 10");
                break;
            case 100:
                System.out.println("el camino se fue por 100");
                break;
            default:
                System.out.println("el camino por defecto");
                System.out.println("no e sni cero, ni 10, ni 100");
                break;

        }
    }
}
