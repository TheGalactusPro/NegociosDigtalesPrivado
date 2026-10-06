package negocios;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public void mostrarInformacion() {
        System.out.println("Nombre: " +getNombre()+ "\nPrecio: " + getPrecio());
    }

    public void mostrarCategoria() {
        System.out.println("Categoria: " + getCategoria());
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }
}