public class Nodo {

    //Campos
    Estudiante dato;
    Nodo sig;

    //Constructor


    public Nodo(Estudiante dato)
    {
        this.dato = dato;
        this.sig = null;
    }

    public Nodo()
    {
        dato = null;
        sig = null;
    }

    //ejemplo  crear una lista
}