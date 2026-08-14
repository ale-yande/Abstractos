public class Main {
    static void main() {
        Cuenta cuenta1 = new Cuenta("Juan", "lopez", "01", "Ahorros", 1000.00, 5.00);
        Cuenta cuenta2 = new Cuenta("Jose", "perez", "02", "Corriente", 800.00, 3.00);

        System.out.println();

        System.out.println("Saldo incial Cuenta 1: 1000");
        System.out.println("Saldo incial Cuenta 2: 800");
        System.out.println();

        System.out.println("- CUENTA 1 -");
        cuenta1.mostrarDatos();

        System.out.println();

        System.out.println("Saldo actual: "+cuenta1.consultarSaldo());

        System.out.println();

        System.out.println("Consignando 1000");
        cuenta1.consignarSaldo(1000.00);

        System.out.println("Saldo actual: "+cuenta1.consultarSaldo());

        System.out.println();

        System.out.println("Retirando 300");
        cuenta1.retirarSaldo(300);

        System.out.println("Saldo actual: "+cuenta1.consultarSaldo());

        System.out.println();

        System.out.println("Tratando de retirar 1800");
        cuenta1.retirarSaldo(1800);

        System.out.println("Saldo actual: "+cuenta1.consultarSaldo());

        // Parte B

        System.out.println();

        System.out.println("- INTERES -");

        System.out.println("Saldo antes del interes: "+cuenta1.consultarSaldo());
        cuenta1.calculoTasa();

        System.out.println("Saldo despues del interes: "+cuenta1.consultarSaldo());

        // Nueva Cuenta2

        System.out.println();

        System.out.println("- CUENTA 2 -");
        cuenta2.mostrarDatos();

        // Parte C, Comparar saldos de cuentas

        System.out.println();

        System.out.println("Comparar saldos: ");

        System.out.println("¿Cuenta 1 tiene saldo mayor o igual que Cuenta 2? "+cuenta1.compararSaldo(cuenta2));

        // Parte C - Transferencia

        System.out.println();

        System.out.println("- TRANSFERENCIA -");

        System.out.println("Saldo cuenta 1 antes: "+cuenta1.consultarSaldo());

        System.out.println("Saldo cuenta 2 antes: "+cuenta2.consultarSaldo());

        System.out.println();

        System.out.println("Transfiriendo 200 de Cuenta1 a Cuenta2");
        cuenta1.transferir(cuenta2, 200);

        System.out.println();

        System.out.println("Saldo cuenta 1 despues: "+cuenta1.consultarSaldo());

        System.out.println("Saldo cuenta 2 despues: "+cuenta2.consultarSaldo());

        // Probar Cuenta inactiva

        System.out.println();
        System.out.println("Retirando todo el saldo de Cuenta 2:");

        cuenta2.retirarSaldo(cuenta2.consultarSaldo());
        cuenta2.mostrarDatos();
        System.out.println();

        System.out.println("Intentando consignar 100 en Cuenta2:");
        cuenta2.consignarSaldo(100.00);

        System.out.println();

        cuenta2.mostrarDatos();
    }
}