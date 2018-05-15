public class Main {

    public static void main (String []arg) {

        Operaciones op  = new Operaciones();
        Lista lis = new Lista();
        lis = op.insertarN(lis);
        op.mostrar(lis);

        op.carrera(lis);

        op.edad20(lis);

        //op.antiguo(lis);

        op.carreraCantidad(lis);

    }

}
