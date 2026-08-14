public class Main {
    static void main() {
        Producto producto1 = new Producto("123","semillas",100.00, 0);
        Producto producto2 = new Producto("887", "tierra", 200.00, 0);

        producto1.mostrarDatos();

        System.out.println();

        producto2.mostrarDatos();

        System.out.println();

        System.out.println("Cantidad de stock de productos: ");
        System.out.println("Producto 1: "+producto1.consultarStock());
        System.out.println("Producto 2: "+producto2.consultarStock());

        System.out.println();

        System.out.println("Suma de cantidad (2) a producto1 ");
        producto1.ingresarStock(2);
        System.out.println("Suma de cantidad (5) a producto2 ");
        producto2.ingresarStock(5);

        System.out.println();

        System.out.println("Cantidad actual de producto 1: "+producto1.consultarStock());
        System.out.println("Cantidad actual de producto 2: "+producto2.consultarStock());

        System.out.println();

        System.out.println("Se vende 1 unidad de producto1");
        producto1.venderProducto(1);
        System.out.println("Se venden 2 unidades de producto2");
        producto2.venderProducto(2);

        System.out.println();
        System.out.println("Cantidad actual de producto 1: "+producto1.consultarStock());
        System.out.println("Cantidad actual de producto 2: "+producto2.consultarStock());

        System.out.println();
        System.out.println("Se venden 4 unidades más de producto2");
        producto2.venderProducto(4);
    }
}
