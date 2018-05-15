public class Vehiculo {

    private String placa, marca;
    private int modelo;

    public Vehiculo(String placa, String marca, int modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo()
    {
        placa = marca = null;
        modelo = 0 ;
    }

    public void leer()
    {
        System.out.println("\nInformación Vehiculo Nuevo");

        System.out.println("placa:");
        placa = Leer.dato();
        System.out.println("marca:");
        marca = Leer.dato();
        System.out.println("modelo:");
        modelo = Leer.datoInt();
    }

    public void mostrar()
    {
        System.out.println("\nInformacion Vehículo");
        System.out.println("placa:\t"+placa +"\nmarca:\t"+marca+"\nmodelo:\t"+modelo);
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
}
