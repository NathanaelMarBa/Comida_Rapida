package Nathanael.Martinez.Productos;

public class Hotdog extends Productos{
    @Override
    public double calcularPrecio() {
        double precio = 0.0;
        if(getCategoria() == "sencillo"){
            precio = 20;
        }if(getCategoria() == "tocino"){
            precio = 25;
        }if(getCategoria() == "buldog"){
            precio = 30;
        }

        return 0;
    }
}
