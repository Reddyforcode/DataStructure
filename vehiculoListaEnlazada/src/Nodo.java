public class Nodo {
    Vehiculo dato;
    Nodo sig;

    Nodo()
    {
        dato = null;
        sig = null;
    }

    Nodo (Vehiculo dato)
    {
        this.dato = dato;
        this.sig = null;
    }


}
