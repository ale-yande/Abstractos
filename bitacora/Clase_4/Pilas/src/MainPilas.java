import Implementacion.Estrategia_1;
import Implementacion.Estrategia_2;
import Implementacion.Estrategia_3;
import Interfaces.PilaTDA;

public class MainPilas {
    public static void main(String[] args) {

        PilaTDA p1 = new Estrategia_1();
        PilaTDA p2 = new Estrategia_2();
        PilaTDA p3 = new Estrategia_3();

        probarPila("Estrategia 1", p1);
        probarPila("Estrategia 2", p2);
        probarPila("Estrategia 3", p3);
    }

    public static void probarPila(String nombre, PilaTDA pila) {
        System.out.println("=== " + nombre + " ===");
        pila.InicializarPila();

        pila.Apilar(8);
        pila.Apilar(3);
        pila.Apilar(12);
        pila.Desapilar();
        pila.Apilar(7);
        pila.Apilar(5);

        System.out.println("Tope (a): " + pila.Tope()); // Imprime 5

        pila.Desapilar();
        pila.Desapilar();

        System.out.println("Tope (b): " + pila.Tope()); // Imprime 3

        pila.Apilar(15);

        System.out.println("Tope (c): " + pila.Tope()); // Imprime 15

        System.out.println("cantidad de elementos: " + cantidadElementos(pila));
        System.out.println("Cantiene 3? " + contiene(pila,3));

        System.out.println();
    }

    public static int cantidadElementos(PilaTDA pila) {
        PilaTDA aux = new Estrategia_1();
        aux.InicializarPila();
        int contador = 0;

        while (!pila.PilaVacia()){
            aux.Apilar(pila.Tope());
            pila.Desapilar();
            contador+=1;
        }

        while (!aux.PilaVacia()){
            pila.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return contador;
    }
    public static boolean contiene(PilaTDA pila, int x) {
        boolean encontrado = false;
        PilaTDA aux = new Estrategia_1();
        aux.InicializarPila();


        while (!pila.PilaVacia()) {
            if (pila.Tope()==x){
                encontrado = true;
            }
            aux.Apilar(pila.Tope());
            pila.Desapilar();
        }

        while (!aux.PilaVacia()){
            pila.Apilar(aux.Tope());
            aux.Desapilar();
        }

        return encontrado;
    }

}