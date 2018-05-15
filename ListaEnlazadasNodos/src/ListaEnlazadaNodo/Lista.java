package ListaEnlazadaNodo;

public class Lista {

    static Nodo primero;


    public Lista()
    {
        primero = null;
    }

    public void  inicializar()
    {
    primero = null; //vaciar la lista
    }

    public void insertar(int d)
    {
        Nodo nuevo = new Nodo(d);
        //conectar el nodo a la lista
        nuevo.sig = primero;
        primero = nuevo;

    }

    public void eliminar()
    {
    if(!listaVacia())
    {
        primero = primero.sig;
    }

    }

    public boolean listaVacia()
    {
        return primero == null;
    }


    public static void main (String []arg) {


        Operaciones op  = new Operaciones();
        Lista lis = new Lista();
        lis = op.insertarN(lis);
        op.mostrar(lis);
        op.promedioPos(lis);
        op.mayor(lis);
        op.mostrarPar(lis);



    }
}