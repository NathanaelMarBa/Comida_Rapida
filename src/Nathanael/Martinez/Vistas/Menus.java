package Nathanael.Martinez.Vistas;

import org.w3c.dom.Text;

import java.util.Scanner;

public class Menus {
    private static Scanner scanner = new Scanner(System.in);

    public static int mostrar(String texto) {
        System.out.println(texto);
        System.out.print(": ");
        return scanner.nextInt();
    }
}
