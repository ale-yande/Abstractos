public class Producto {
    // Atributos
    private String codigo;
    private String nombre;
    private Double precio;
    private int cantidad;

    // Constructor con parametros
    public Producto(String codigo, String nombre, Double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    // Metodo
    public void mostrarDatos() {
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
    }

    public int consultarStock() {
        return cantidad;
    }

   public void ingresarStock(int cantidadStock){
        cantidad = cantidad + cantidadStock;
   }

   public void venderProducto(int cantidadVenta) {

       if (cantidadVenta <= cantidad) {
           cantidad = cantidad - cantidadVenta;
       }
       else {
           System.out.println("No hay stock para vender!!!");
       }
   }
}
