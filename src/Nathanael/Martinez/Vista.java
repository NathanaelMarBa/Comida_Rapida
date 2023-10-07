package Nathanael.Martinez;

import Nathanael.Martinez.Productos.Agua;

import java.util.Scanner;

public class Vista {
    Agua agua = new Agua();
    String opcion = "";
    Scanner sc = new Scanner(System.in);

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public void Orden (){

        System.out.println("Bienvenido, Que deseas ordenar el dia de hoy?");
        System.out.println("Bebidas:");
        System.out.println("1- Agua");
        System.out.println("2- Refresco");
        System.out.println("Alimentos:");
        System.out.println("3- Hamburguesa");
        System.out.println("4- Hotdog");
        System.out.println("5- Papas");
        System.out.println("6- Pizza");

        opcion = sc.nextLine();

        switch (opcion){

            case "1":
                System.out.println("Elegiste Agua");
                agua.calcularPrecio();
                break;
            case "2":
                System.out.println("Elegiste Refresco");
                break;
            case "3":
                System.out.println("Elegiste Hamburguesa");
                break;
            case "4":
                System.out.println("Elegiste Hotdog");
                break;
            case "5":
                System.out.println("Elegiste Papas");
                break;
            case "6":
                System.out.println("Elegiste Pizza");
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }


    }
}
