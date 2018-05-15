public class Nodo {

    //Campos
    Vehiculo v;
    Nodo sig;

    //Constructor

    public Nodo(Vehiculo v)
    {
        this.v = v;
        this.sig = null;
    }

    public Nodo()
    {
        v = null;
        sig = null;
    }

    //ejemplo  crear una lista
}