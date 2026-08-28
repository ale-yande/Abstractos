import Implementacion.ColaEstatica;
import Interface.ColaTDA;

public class MainColas {
    public static void main(String[] args) {
        ColaTDA cola = new ColaEstatica();

        cola.InicializarCola();
        cola.InicializarCola();
        cola.Acolar(5);
        cola.Acolar(9);
        cola.Acolar(2);
        cola.Acolar(8);
        System.out.println(cola.Primero()); // (a)
        cola.Desacolar();
        cola.Desacolar();
        cola.Acolar(6);
        cola.Acolar(11);
        System.out.println(cola.Primero()); // (b)
        cola.Desacolar();
        System.out.println(cola.Primero()); // (c)
        System.out.println("Suma de todos los numeros de la cola: " + sumar(cola));
        eliminar(cola,8);
        System.out.println("Primero sin el numero 8: " + cola.Primero());
    }
    public static int sumar(ColaTDA cola){
        int contador=0;
        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();

        while (!cola.ColaVacia()){
            contador=contador+cola.Primero();
            aux.Acolar(cola.Primero());
            cola.Desacolar();
        }

        while (!aux.ColaVacia()){
            cola.Acolar(aux.Primero());
            aux.Desacolar();
        }
        return contador;
    }
    static void eliminar(ColaTDA cola, int x) {

        ColaTDA aux = new ColaEstatica();
        aux.InicializarCola();

        while (!cola.ColaVacia()) {
            if (cola.Primero()!=x){
                aux.Acolar(cola.Primero());
            }
            cola.Desacolar();
        }

        while (!aux.ColaVacia()){
            cola.Acolar(aux.Primero());
            aux.Desacolar();
        }
    }


}