package Nathanael.Martinez.Vistas;

public class Caja extends Thread{

    @Override
    public void run(){
        Caja();
    }
    public static void Caja() {
        try {
            int opcion;
            double total = 0.0;

            do {
                opcion = Menus.mostrar(Textos.menuPrincipal);
                total += Menus.seleccionarOpcion(opcion);
                Thread.sleep(3000);
            } while (opcion != 10);
            System.out.println("El total a pagar es de: $" + total);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}