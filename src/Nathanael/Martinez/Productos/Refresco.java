package Nathanael.Martinez.Productos;

public class Refresco extends Productos{


    @Override
    public double calcularPrecio() {
        double precio = 0.0;
        if(getTamanio() == "chico"){
            precio = 10;
        }if(getTamanio() == "mediano"){
            precio = 15;
        }if(getTamanio() == "grande"){
            precio = 20;
        }
        return precio;
    }
}
