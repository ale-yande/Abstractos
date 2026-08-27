public class Implementacion implements PilaTDA {
    int[] pila;
    int cantidad;
    static final int MAX = 100;

    @Override
    public void InicializarPila(){
        pila = new int[MAX];
        cantidad = 0;
    }
    @Override
    public void Apilar(int valor){
        if (cantidad < MAX){
            pila[cantidad] = valor;
            cantidad++;
        }
    }
    @Override
    public void Desapilar(){
        if (cantidad > 0){
            cantidad--;
        }
    }
    @Override
    public int Tope(){
        if (cantidad > 0){
            return pila[cantidad-1];
        }else {
            throw new IllegalStateException("No hay elementos");
        }
    }
    @Override
    public boolean PilaVacia(){
        return cantidad == 0;
    }

}

