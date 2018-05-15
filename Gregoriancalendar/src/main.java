import java.util.GregorianCalendar;
import java.util.Calendar;


public class main {
    public static void main (String[]args)
    {

        String a = "a";
        String b = "b";

        System.out.println(b.compareTo(a));

        String vec[] = {"neida", "abel","emanuel" ,"tintaya", "tintbiriche","rich","paulo"};

        //System.out.println(hoy.after(mañana));

        //ordenacionPorInserion(vec);
        //OrdenacionPorSeleccion(vec);
        ordenacionPorIntercambio(vec);
        //alonso despues de alberto sale 13
    }

    public static void OrdenacionPorSeleccion(String v[])
    {
        int k;
        String aux;
        for(int i = 0; i<v.length; i++)
        {
            k= i;
            for (int j = i+1;j<v.length;j++)
            {
                if(v[j].compareTo(v[k]) < 0)
                {
                    k=j;
                }
            }
            if(k!=i)
            {
                aux = v[i];
                v[i] = v[k];
                v[k] = aux;
            }

            mostrar (v);
            System.out.println();
        }
    }

    public static void ordenacionPorIntercambio(String v[])
    {
        String aux;
        for (int i = 1; i < v.length; i ++)
        {
            for (int j = 0; j < v.length-i ; j ++)
            {
                if(v[j].compareTo(v[j+1]) > 0)
                {
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }

                mostrar (v);
                System.out.println();
            }

        }

    }


    public static void ordenacionPorInserion(String v[])
    {
        String aux;
        int j;

        for (int i = 0; i < v.length; i ++)
        {
            aux = v[i];
            j = i-1;

            while(j>=0 && v[j].compareTo(aux) > 0)
            {
                v[j+1] = v[j];
                j -=1;
            }

            v[j+1] = aux;

            mostrar (v);
            System.out.println();
        }

        System.out.println();
    }

    public static void mostrar(String v[])
    {
        for (int i = 0; i< v.length; i ++) {
            System.out.print("|" + v[i]);
        }
    }
}
