package Nathanael.Martinez.Productos;

public class Pizza extends Productos{
    @Override
    public double calcularPrecio() {
        double precio = 0.0;

        if(getCategoria() == "Hawaiana"){
            precio = 200;
        }if(getCategoria() == "Pastor"){
            precio = 220;
        }if(getCategoria() == "Mexicana"){
            precio = 250;
        }

        return precio;
    }
}
