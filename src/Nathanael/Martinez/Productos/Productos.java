package Nathanael.Martinez.Productos;

import java.awt.datatransfer.StringSelection;

public abstract class Productos {

    private String nombreProductos;
    private String categoria;
    private String tamanio;
    private double precio;

    public String getNombreProductos() {
        return nombreProductos;
    }

    public void setNombreProductos(String nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTamanio() {
        return tamanio.toLowerCase().trim();
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularPrecio();
}