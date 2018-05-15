public class Lista {

    Nodo primero;
    public Lista()
    {
        primero = null;
    }

    public void inicializar ()
    {
        primero = null;
    }

    public boolean listaVacia()
    {
        return primero == null;
    }

    public void insertar2(Nodo pos, Vehiculo x)
    {
         Nodo nuevo = new Nodo(x);
         nuevo.sig = pos.sig;
         pos.sig = nuevo;
    }

    public void insertar(Vehiculo x) {
        Nodo nuevo = new Nodo(x);
        nuevo.sig = primero;
        primero = nuevo;
    }

    public void eliminar()
    {
        if(!listaVacia())
            primero = primero.sig;
    }

    public void eliminar2(Nodo pos)
    {
        pos.sig = pos.sig.sig;
    }
}

