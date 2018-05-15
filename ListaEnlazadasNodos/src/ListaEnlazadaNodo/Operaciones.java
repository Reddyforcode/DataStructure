package ListaEnlazadaNodo;

public class Operaciones {

    public Lista insertarN (Lista L)
    {
        System.out.println("número de nodos:");
        int n = Leer.datoInt();
        int x;
        for(int c = 0; c<=n; ++c)
        {
            System.out.println("dato "+c+"=");
            x= Leer.datoInt();
            L.insertar(x);
        }
        return L;
    }

    public void mostrar(Lista L)
    {
        Nodo p = L.primero;
        while(p!=null)
        {
            System.out.println(p.dato);
            p = p.sig;
        }
    }

    public void promedio(Lista L)
    {
        float sum = 0;
        int n = 0;

        Nodo p = L.primero;
        while(p!=null)
        {
            if(p.dato%2 == 0) {
                sum += p.dato;
                n++;
            }
            p = p.sig;
        }

        //System.out.print("promedio : "+sum+"/"+n+" = ");
        System.out.print("Promedio de los positivos es: ");
        System.out.println(sum/n);
    }

    public void mostrarPar(Lista L)
    {
        System.out.println("Lisa de Pares en la Lista");
        Nodo p = L.primero;
        while(p!=null)
        {

            if(p.dato%2 ==0)
            {
                System.out.print(p.dato+"|");
            }
            p = p.sig;
        }
    }

    public void mayor(Lista L)
    {
        Nodo p = L.primero;
        int mayor = p.dato;
        while(p!=null)
        {
            if(p.dato > mayor) {
                mayor=p.dato;
            }
            p = p.sig;

        }

        System.out.println("mayor = " + mayor);
    }

    public void promedioPos(Lista L)
    {
        float sum = 0;
        int n = 0;

        Nodo p = L.primero;
        while(p!=null)
        {
            if(p.dato > 0) {
                sum += p.dato;
                n++;
            }
            p = p.sig;
        }

        //System.out.print("promedio : "+sum+"/"+n+" = ");
        System.out.print("Promedio de los positivos es: ");
        System.out.println(sum/n);
    }

}
