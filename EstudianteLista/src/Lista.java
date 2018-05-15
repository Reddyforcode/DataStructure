public class Lista {

    Nodo primero;


    public Lista()
    {
        primero = null;
    }

    public void  inicializar()
    {
    primero = null; //vaciar la lista
    }

    public void insertar(Estudiante v)
    {
        Nodo nuevo = new Nodo(v);
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



}