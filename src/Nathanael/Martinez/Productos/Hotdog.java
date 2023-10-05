package Nathanael.Martinez.Productos;

public class Hotdog extends Productos{
    @Override
    public double calcularPrecio() {
        double precio = 0.0;
        if(getTamanio() == "chica"){
            precio = 20;
        }if(getTamanio() == "mediana"){
            precio = 25;
        }if(getTamanio() == "grande"){
            precio = 30;
        }

        return 0;
    }
}
