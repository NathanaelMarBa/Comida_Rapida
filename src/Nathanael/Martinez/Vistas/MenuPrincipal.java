package Nathanael.Martinez.Vistas;

import java.util.Scanner;

public class MenuPrincipal {
    private static Scanner scanner = new Scanner(System.in);
    public static int menuPrincipal(){
        System.out.println(Textos.menuPrincipal);
        System.out.print(": ");
        return scanner.nextInt();
    }
}