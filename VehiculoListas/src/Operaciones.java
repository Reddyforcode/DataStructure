public class Operaciones {

    public Lista insertarN (Lista L)
    {
        System.out.println("número de nodos:");
        Vehiculo v = null;
        int n = Leer.datoInt();
        for (int c = 0;c<n;c++)
        {
            v = new Vehiculo();
            v.leer();
            L.insertar(v);
        }
        /*for(int c = 1; c<=n;c++)
        {
            v = new Vehiculo();
            v.leer();
        }
        */
/*
        Vehiculo nv = new Vehiculo();

        int n = Leer.datoInt();
        int x;
        for(int c = 0; c<=n; ++c)
        {
            nv.leer();
            L.insertar(nv);
        }*/
        return L;
    }

    public void mostrar(Lista L)
    {
        Nodo p = L.primero;
        while(p!=null)
        {
            p.v.mostrar();
            p = p.sig;
        }
    }

    public void marca(Lista L)
    {
        System.out.println("\nBuscar por marca:");
        String marca = Leer.dato();
        Nodo p = L.primero;
        System.out.println("Placa de los vehiculos de marca "+marca);
        while(p!=null)
        {
            if(p.v.getMarca().equals(marca))
            {
                System.out.println(p.v.getPlaca());
                p = p.sig;
            }else{
                p = p.sig;

            }
        }
    }

    public void antiguo(Lista L)
    {
        Nodo p = L.primero;
        int antiguo = p.v.getModelo();
        while(p!=null)
        {
            if(p.v.getModelo()<antiguo)
            {
                antiguo = p.v.getModelo();
            }
            p = p.sig;
        }

        p = L.primero;
        while(p!=null)
        {
            if(p.v.getModelo()==antiguo)
            {
                System.out.println("marca del Coche mas antiguo: "+p.v.getMarca());
                System.out.println("placa del coche mas antiguo: "+p.v.getPlaca());
            }
            p = p.sig;
        }
    }

    public void eliminarNodo(Lista L)
    {
        L.eliminar();
        L.eliminar();
    }

}