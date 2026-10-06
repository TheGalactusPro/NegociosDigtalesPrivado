package negocios;

public class MainProducto {
    static void main() {
        Producto p1 = new Producto();
        Producto p2 = new Producto();

        p1.setNombre("Mouse");
        p1.setPrecio(20);
        p1.setCategoria("Tecnología");

        p2.setNombre("Curso Java");
        p2.setPrecio(75);
        p2.setCategoria("Educación");

        System.out.println("Producto 1");
        p1.mostrarInformacion();
        p1.mostrarCategoria();

        System.out.println("\nProducto 2");
        p2.mostrarInformacion();
        p2.mostrarCategoria();

        p1.setPrecio(25);

        System.out.println("------------------------------------------");

        System.out.println("Producto 1");
        p1.mostrarInformacion();
        p1.mostrarCategoria();

        System.out.println("\nProducto 2");
        p2.mostrarInformacion();
        p2.mostrarCategoria();
    }
}
