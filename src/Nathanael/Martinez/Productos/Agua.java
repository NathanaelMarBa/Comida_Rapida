package pedro.galvan.productos;

public class Agua extends Productos{
    @Override
    public void setNombreProductos(String nombreProductos) {
        nombreProductos = "Agua";
    }

    @Override
    public void setCategoria(String[] categoria) {
        categoria[1]="Bebida";
    }

    @Override
    public void setPrecio(double precio) {
        
    }
}
