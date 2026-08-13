public class Main {
    static void main() {
        Producto producto1 = new Producto("123", "semillas", 100.00, 10);
        Producto producto2 = new Producto("145", "tierra", 200.00, 20);

        producto1.mostrarDatos();
        System.out.println("");
        producto2.mostrarDatos();
        System.out.println("");
        System.out.println("Cantidad de stock de productos: ");
        System.out.println("Producto 1: "+producto1.consultarStock());
        System.out.println("Producto 2: "+producto2.consultarStock());
        System.out.println("");
        System.out.println("Suma de cantidad (2) a producto1 ");
        producto1.ingresarStock(2);
        System.out.println("Cantidad actual de producto 1: ");
        System.out.println(producto1.consultarStock());

    }
}
