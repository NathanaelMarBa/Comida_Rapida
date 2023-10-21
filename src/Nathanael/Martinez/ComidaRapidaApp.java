package Nathanael.Martinez;

import Nathanael.Martinez.Productos.Agua;
import Nathanael.Martinez.Vistas.*;
import org.w3c.dom.Text;
public class ComidaRapidaApp {
    public static void main(String[] args) {

        int opcion = Menus.mostrar(Textos.menuPrincipal);
        Menus.seleccionarOpcion(opcion);
    }
}