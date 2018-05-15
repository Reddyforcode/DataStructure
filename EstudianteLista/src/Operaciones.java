public class Operaciones {
private int n;
    public Lista insertarN (Lista L)
    {
        System.out.println("número de nodos:");
        Estudiante v = null;
        int n = Leer.datoInt();
        this.n = n;
        /*for (int c = 0;c<n;c++)
        {
            v = new Estudiante();
            v.leer();

            L.insertar(v);
        }*/
        v = new Estudiante(8432290, "reddy", "sist");
        v.leerF();
        L.insertar(v);

        v = new Estudiante(8432289, "paulo", "inf");
        v.leerF();
        L.insertar(v);

        v = new Estudiante(6322234, "neii", "pscic");
        v.leerF();
        L.insertar(v);


        return L;
    }

    public void mostrar(Lista L)
    {
        Nodo p = L.primero;
        while(p!=null)
        {
            p.dato.mostrar();
            p = p.sig;
        }
    }

    public void carrera(Lista L)
    {
        System.out.println("\nBuscar por carrera:");
        String carrera = Leer.dato();
        Nodo p = L.primero;
        System.out.println("Estudiantes de "+ carrera);
        while(p!=null)
        {
            if(p.dato.getCarrera().equals(carrera))
            {
                System.out.println(p.dato.getNombre());
                p = p.sig;
            }else{
                p = p.sig;
            }
        }
    }


    public void edad20(Lista L)
    {
        System.out.println("\nEstudiantes mayores de 20 años:");
        Nodo p = L.primero;
        while(p!= null)
        {
            if(p.dato.getEdadHoy()>20) {
                System.out.println("Nombre:\t"+p.dato.getNombre());
                System.out.println("Ci:\t"+p.dato.getCi());
                p = p.sig;
            }
            else    p = p.sig;
        }
    }

    public void carreraCantidad(Lista L)
    {
        int contCarrera = 0;
        String carrera [] = new String[n];
        int cant [] = new int[n];

        Nodo p = L.primero;
        while(p!=null)
        {
            carrera [0] = p.dato.getCarrera();
            cant [0] = 0;
            contCarrera = 1;

            for(int i = 0 ; i<contCarrera; i ++) {
                if (p.dato.getCarrera().equals(carrera[i]))
                {
                    System.out.println("paso: "+1);
                    cant [i] += 1;

                }else{
                    carrera[contCarrera] = p.dato.getCarrera();
                    cant[contCarrera] = 1;
                    contCarrera ++;

                }

                p = p.sig;
            }


        }

        for(int i = 0; i< contCarrera;i++)
        {
            System.out.println(carrera[i] +"-->"+cant[i]);
        }

    }


}