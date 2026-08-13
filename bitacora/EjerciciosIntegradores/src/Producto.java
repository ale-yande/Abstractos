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
        this.cantidad = cantidad;
    }

    // Método
    public void mostrarDatos() {
        System.out.println("Codigo: "+codigo);
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int consultarStock() {
        return cantidad;
    }

   public void ingresarStock(int cantidadStock){
        cantidad = cantidad + cantidadStock;
   }
}
