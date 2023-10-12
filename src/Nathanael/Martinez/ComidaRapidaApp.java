package Nathanael.Martinez;

import Nathanael.Martinez.Vistas.*;
import org.w3c.dom.Text;

public class ComidaRapidaApp {
    public static void main(String[] args) {
        
        int opcion = Menus.mostrar(Textos.menuPrincipal);

        seleccionarOpcion(opcion);
    }

    public static void seleccionarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                Menus.mostrar(Textos.menuBebidas);
                break;
            case 2:
                 Menus.mostrar(Textos.menuBebidas);
                break;
            case 3:
                Menus.mostrar(Textos.menuHamburguesa);
                break;
            case 4:
                Menus.mostrar(Textos.menuPizza);
                break;
            case 5:
                Menus.mostrar(Textos.menuHotdog);
                break;
            case 6:
                Menus.mostrar(Textos.menuPapas);
                break;
            default:
                System.out.println(Textos.opcionIncorrecta);
        }
    }
}