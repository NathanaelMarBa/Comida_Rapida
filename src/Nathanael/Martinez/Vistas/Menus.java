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



    public static double seleccionarOpcion(int opcion) {

        int tamanio;
        double precio = 0;
        double total = 0;

        switch (opcion) {
            case 1 -> {
                tamanio = Menus.mostrar(Textos.menuBebidas);
                Productos agua = new Agua(tamanio);
                precio = agua.calcularPrecio();
                System.out.println("Agua: $" + precio);
                return precio;
            }
            case 2 -> {
                tamanio = Menus.mostrar(Textos.menuBebidas);
                Productos refresco = new Refresco(tamanio);
                precio = refresco.calcularPrecio();
                System.out.println("Refresco: $" + precio);
                return precio;
            }
            case 3 -> {
                tamanio = Menus.mostrar(Textos.menuHamburguesa);
                Productos hamburguesa = new Hamburguesa(tamanio);
                precio = hamburguesa.calcularPrecio();
                System.out.printf("Hamburguesa: $" + precio);
                return precio;
            }
            case 4 -> {
                tamanio = Menus.mostrar(Textos.menuPizza);
                Productos pizza = new Pizza(tamanio);
                precio = pizza.calcularPrecio();
                System.out.println("Pizza: $" + precio);
                return precio;
            }
            case 5 -> {
                tamanio = Menus.mostrar(Textos.menuHotdog);
                Productos hotdog = new Hotdog(tamanio);
                precio = hotdog.calcularPrecio();
                System.out.println("Hotdog: $" + precio);
                return precio;
            }
            case 6 -> {
                tamanio = Menus.mostrar(Textos.menuPapas);
                Productos chips = new Chips(tamanio);
                precio = chips.calcularPrecio();
                System.out.println("Papas: $" + precio);
                return precio;
            }
            case 10 -> {
                System.out.println("Perfecto en un momento tendremos tu monto total");
            }
            default -> System.out.println(Textos.opcionIncorrecta);
        }
        return total;
    }
}