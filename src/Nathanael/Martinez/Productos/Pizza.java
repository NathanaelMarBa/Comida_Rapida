package Nathanael.Martinez.Productos;

public class Pizza extends Productos{
    @Override
    public double calcularPrecio() {
        double precio = 0.0;

        if(getTamanio() == "chica"){
            precio = 200;
        }if(getTamanio() == "mediana"){
            precio = 220;
        }if(getTamanio() == "grande"){
            precio = 250;
        }

        return precio;
    }
}
