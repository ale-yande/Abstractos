public class Cuenta {

    // Atributos
    private String nombre;
    private String apellido;
    private String numeroCuenta;
    private String tipoCuenta;
    private Double saldo;
    private Double interes;
    private boolean activa;

    public Cuenta(String nombre, String apellido, String numeroCuenta, String tipoCuenta,Double saldo, Double interes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.interes = interes;
        this.activa = true;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: " +apellido);
        System.out.println("Numero de cuenta: " +numeroCuenta);
        System.out.println("Tipo de cuenta: " +tipoCuenta);
        System.out.println("Saldo: " +saldo);
        System.out.println("Activa: "+activa);
    }

    public Double consultarSaldo() {
        return saldo;
    }

    public void consignarSaldo(Double cantidad) {
        if (!activa){
            System.out.println("No se puede consignar, la cuenta esta inactiva");
        }
        else if (cantidad>0) {
            saldo += cantidad;
            if (saldo > 0) {
                activa = true;
            }

        } else {
            System.out.println("La cuenta esta inactiva");
        }
    }

    public boolean retirarSaldo(double cantidad) {

        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;

            if (saldo == 0) {
                activa = false;
            }

            return true;

        } else {
            System.out.println("No hay suficiente saldo para retirar");
            return false;
        }
    }

    public void calculoTasa(){
        saldo = saldo + ( (saldo * interes) / 100);
    }

    public boolean compararSaldo(Cuenta cuenta) {
        return saldo >= cuenta.saldo;
    }

    public void transferir(Cuenta cuentaDestino, double cantidad) {

        if (retirarSaldo(cantidad)) {
            cuentaDestino.consignarSaldo(cantidad);
        }
    }

}
