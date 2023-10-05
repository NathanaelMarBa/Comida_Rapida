package Nathanael.Martinez.Productos;

public class Hamburguesa extends Productos{
    @Override
    public double calcularPrecio() {
        double precio = 0.0;

        if(getTamanio() == "chica"){
            precio = 40;
        }if(getTamanio() == "mediana"){
            precio = 45;
        }if(getTamanio() == "grande") {
            precio = 50;
        }
        return precio;
    }
}
