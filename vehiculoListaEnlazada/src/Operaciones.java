public class Operaciones {

    public Lista insertarN(Lista L)
    {
        System.out.println("No. de nodos =");
        int nd = Leer.datoInt();


        for (int c = 0 ; c<nd; c++) {
            Vehiculo v  =new Vehiculo();
            v.leer();
            L.insertar(v);
        }
        return L;
    }

    public  void mostrar(Lista L)
    {
        Nodo p = L.primero;

        while(p != null)
        {
            p.dato.mostrar();
            p = p.sig;
        }
    }

    public void reciente(Lista L)
    {
        int mayor = 0;
        Nodo p = L.primero;
        while(p != null)
        {
            if(p.dato.getModelo()>mayor)
            {
                mayor = p.dato.getModelo();
                p = p.sig;
            }else {
                p = p.sig;
            }
        }

        p = L.primero;
        while(p!= null)
        {
            if(p.dato.getModelo()==mayor)
            {
                System.out.println("\nplaca"+ p.dato.getPlaca());
            }
        }
    }

    public void insertar(Lista L)
    {
        Vehiculo n = new Vehiculo();
        n.leer();
        L.insertar(n);
    }

    public void instertarFin (Lista L, Vehiculo x)
    {
        if(L.listaVacia())
        {
            L.insertar(x);
        }
        else
        {
            Nodo p = L.primero;
            while(p.sig != null)
            {

                p = p.sig;

            }

            L.insertar2(p , x);
        }
    }

    public void eliminarPlaca(Lista L)
    {
        System.out.println("Eliminar vehiculo con placa: ");
        String placa = Leer.dato();
        Nodo p = L.primero;

        if(p.dato.getPlaca().equals(placa))
            L.eliminar();
        else {
            while (p != null  &&  placa.compareTo(p.sig.dato.getPlaca())!= 0 ) {
                //if (placa.equals(p.dato.getPlaca())) L.eliminar2(p);
                p = p.sig;
            }
            if (p == null) System.out.println("nodo no encontrado");
            else L.eliminar2(p);

        }
    }


}
