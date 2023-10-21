package Nathanael.Martinez.Productos;

public class Hamburguesa {
    private int tamanio;
    public Hamburguesa(int tamanio){
        this.tamanio = tamanio;
    }

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
        if (tamanio == 4){
            precio = 40;
        }
        return precio;
    }
}
