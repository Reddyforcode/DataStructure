public class Operaciones {
    public Cola insertarN(Cola C)
    {
        System.out.println("N° de Elementos");
        int nel = Leer.datoInt();
        int d;
        for(int i = 0; i< nel; i++)
        {
            System.out.println("dato "+i+":");
            d = Leer.datoInt();
            C.insertar(d);
        }
        return C;
    }

    public Cola mostrar(Cola C)
    {
        Cola Caux = new Cola();
        Caux.frente = Caux.fin = C.frente;
        int d;
        while(!C.colaVacia())
        {
            d = C.ver();
            System.out.println(d);
            C.eliminar();
            Caux.insertar(d);
        }
        return Caux;
    }

    public Cola eliminarNeg(Cola C)
    {
        Cola caux = new Cola();
        caux.frente = C.frente;
        caux.fin = C.frente;
        int d;
        while(!C.colaVacia())
        {
            d = C.ver();
            C.eliminar();
            if(d >= 0)  caux.insertar(d);
        }
        return caux;
    }
}