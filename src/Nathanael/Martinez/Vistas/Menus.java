package Nathanael.Martinez.Vistas;

import Nathanael.Martinez.Productos.*;

import java.util.Scanner;

public class Menus {
    private static final Scanner scanner = new Scanner(System.in);

    public static int mostrar(String texto) {
        System.out.print(texto);
        System.out.print(":");
        return scanner.nextInt();
    }

    public static void seleccionarOpcion(int opcion) {

        int tamanio;
        //int precio = 0;
        switch (opcion) {
            case 1 -> {
                tamanio = Menus.mostrar(Textos.menuBebidas);
                Agua agua = new Agua(tamanio);
                System.out.println(agua.calcularPrecio());
            }
            case 2 -> {
//                tamanio = Menus.mostrar(Textos.menuBebidas);
//                Productos refresco = new refresco(tamanio);
//                precio = refresco.calcularPreci();
//                System.out.println("Agua: %n", precio);

                tamanio = Menus.mostrar(Textos.menuBebidas);
                Refresco refresco = new Refresco(tamanio);
                System.out.println(refresco.calcularPrecio());
            }
            case 3 -> {
                tamanio = Menus.mostrar(Textos.menuHamburguesa);
                Hamburguesa hamburguesa = new Hamburguesa(tamanio);
                System.out.println(hamburguesa.calcularPrecio());
            }
            case 4 -> {
                tamanio = Menus.mostrar(Textos.menuPizza);
                Pizza pizza = new Pizza(tamanio);
                System.out.println(pizza.calcularPrecio());
            }
            case 5 -> {
                tamanio = Menus.mostrar(Textos.menuHotdog);
                Hotdog hotdog = new Hotdog(tamanio);
                System.out.println(hotdog.calcularPrecio());
            }
            case 6 -> {
                tamanio = Menus.mostrar(Textos.menuPapas);
                Chips papas = new Chips(tamanio);
                System.out.println(papas.calcularPrecio());
            }
            default -> System.out.println(Textos.opcionIncorrecta);
        }
    }
}