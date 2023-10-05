package Nathanael.Martinez.Productos;

public class Hamburguesa extends Productos{
    @Override
    public double calcularPrecio() {
        double precio = 0.0;

        if(getCategoria() == "sencilla"){
            precio = 40;
        }if(getCategoria() == "hawaiana"){
            precio = 45;
        }if(getCategoria() == "doble"){
            precio = 50;
        }if(getCategoria() == "especial"){
            precio = 55;
        }
        return precio;
    }
}
