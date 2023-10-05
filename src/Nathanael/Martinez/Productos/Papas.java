package Nathanael.Martinez.Productos;

public class Papas extends Productos{
    @Override
    public double calcularPrecio() {
        double precio = 0.0;

        if(getTamanio() == "chicas"){
            precio = 25;
        }if(getTamanio() == "medianas"){
            precio = 35;
        }if(getTamanio() == "grandes"){
            precio = 40;
        }

        return precio;
    }
}
