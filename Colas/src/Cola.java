public class Cola {
    int frente, fin;
    int []elem;
    final int MAX = 50;
    public Cola()
    {
        frente  = fin = MAX;
        elem = new int[MAX+1];
    }

    public void inicializar()
    {
        frente = fin = MAX;
    }

    public boolean colaVacia()
    {
        return frente == fin;
    }

    public boolean colaLlena()
    {
        int sigfin;
        if(fin == MAX)  sigfin=1;
        else    sigfin = fin+1;

        return sigfin == frente;
    }

    public int ver()
    {
        int sigfrente;
        if(frente == MAX)   sigfrente = 1;
        else sigfrente = frente+1;

        return elem[sigfrente];
    }

    public void eliminar()
    {
        if(frente == MAX)   frente = 1;
        else frente = frente + 1;
    }
    public void insertar(int x)
    {
        if(!colaLlena())
        {
            if(fin == MAX)  fin = 1;
            else    fin = fin+1;

            elem[fin] = x;
        }
    }
}
