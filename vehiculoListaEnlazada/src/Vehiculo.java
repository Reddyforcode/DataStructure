public class Vehiculo {

    private String placa, marca;
    private int modelo;

    public void leer()
    {
        System.out.println("placa:");
        placa = Leer.dato();
        System.out.println("marca:");
        marca = Leer.dato();
        System.out.println("modelo:");
        modelo = Leer.datoInt();
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void mostrar()
    {
        System.out.println("\nplaca:"+placa);
        System.out.println("marca:"+marca);
        System.out.println("modelo:"+modelo);
    }
}
