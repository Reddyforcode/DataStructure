public class Operaciones {

    public Lista insertarN (Lista L)
    {
        System.out.println("Número de Nodos");
        int nd = Leer.datoInt();

        for(int c = 0; c < nd; c++)
        {
            System.out.println("dato nodo " + c + ":");
            int dato = Leer.datoInt();
            L.insertar(dato);
        }

        return L;
    }

    public void mostrar(Lista L)
    {
        Nodo p = L.primero;
        while(p != null)
        {
            System.out.println("|"+p.dato +"| -->");
            p = p.sig;
        }
    }

    public void eliminarULtimo(Lista L)
    {

        if(!L.listaVacia())
        {
            if(L.primero.sig == null)
            {
                L.eliminar();
            }else
            {
                Nodo p = L.primero;

                while(p.sig.sig != null)
                {
                    p = p.sig;
                }
                L.eliminar2(p);
            }
        }
    }

    public void añadirNodo(Lista L, int datoDado)
    {
        Nodo p = L.primero;
        while((p!= null) && (p.dato != datoDado))
        {
            p = p.sig;
        }

        System.out.println("dato nuevo: ");
        int x = Leer.datoInt();
        L.insertar2(p, x);
    }


    public Nodo posMayor(Lista L)
    {
        Nodo p = L.primero;
        Nodo pos = p;
        while(p!= null)
        {
            if(p.dato > pos.dato)
            {
                p = p.sig;
            }
        }
        return pos;
    }

    public void eliminarMayor (Lista L)
    {
        Nodo pos = posMayor(L);
        if (pos == L.primero)
        {
            L.eliminar();
        }else
        {
            Nodo p = L.primero;
            while (p.sig != pos)
                p = p.sig;
            L.eliminar2(p);
        }
    }

}
