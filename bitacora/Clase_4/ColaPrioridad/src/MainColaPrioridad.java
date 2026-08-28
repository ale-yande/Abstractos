import Implementacion.ColaPrioridadEstatica;
import Interface.ColaPrioridadTDA;

public class MainColaPrioridad {
    public static void main(String[] args) {
        ColaPrioridadTDA cola = new ColaPrioridadEstatica();

        cola.InicializarColaPrioridad();
        cola.AcolarPrioridad(20, 2);
        cola.AcolarPrioridad(15, 0);
        cola.AcolarPrioridad(8, 1);
        cola.AcolarPrioridad(12, 0);
        cola.AcolarPrioridad(30, 2);
        cola.AcolarPrioridad(6, 1);
        System.out.println(cola.Primero()); // (a)
        System.out.println(cola.Prioridad()); // (b)
        cola.Desacolar();
        cola.Desacolar();
        System.out.println(cola.Primero()); // (c)
        System.out.println(cola.Prioridad()); // (d)
        System.out.println("Cantidad con prioridad 2: " + contar(cola,2));
        eliminar(cola, 2);
        System.out.println("Cantidad con prioridad 2 despues de eliminar: " + contar(cola,2));

    }
    static int contar(ColaPrioridadTDA cola, int x) {
        int contador=0;
        ColaPrioridadTDA aux = new ColaPrioridadEstatica();
        aux.InicializarColaPrioridad();

        while (!cola.ColaVacia()) {
            if (cola.Prioridad() == x) {
                contador++;
            }
            aux.AcolarPrioridad(cola.Primero(), cola.Prioridad());
            cola.Desacolar();

        }

        while (!aux.ColaVacia()) {
            cola.AcolarPrioridad(aux.Primero(), aux.Prioridad());
            aux.Desacolar();
        }

        return contador;
    }
    static void eliminar(ColaPrioridadTDA cola, int x) {

        ColaPrioridadTDA aux = new ColaPrioridadEstatica();
        aux.InicializarColaPrioridad();

        while (!cola.ColaVacia()) {
            if (cola.Prioridad()!=x){
                aux.AcolarPrioridad(cola.Primero(), cola.Prioridad());
            }
            cola.Desacolar();
        }

        while (!aux.ColaVacia()){
            cola.AcolarPrioridad(aux.Primero(), aux.Prioridad());
            aux.Desacolar();
        }

    }
}