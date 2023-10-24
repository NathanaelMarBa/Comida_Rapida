package Nathanael.Martinez.Productos;

public class Hotdog extends Productos{
    private int tamanio;
    public Hotdog(int tamanio){
        this.tamanio = tamanio;
    }
@Override
    public double calcularPrecio(){
        double precio = 0.0;
        if(tamanio == 1){
            precio = 10;
        }
        if (tamanio == 2){
            precio = 20;
        }
        if (tamanio == 3){
            precio = 30;
        }
        return precio;
    }
}
