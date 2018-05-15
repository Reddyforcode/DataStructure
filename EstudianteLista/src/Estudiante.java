import java.util.GregorianCalendar;
import java.util.Calendar;

public class Estudiante {
    private int ci;
    private String nombre, carrera;
    private GregorianCalendar fechaNac;

    public Estudiante()
    {
        ci = 0;
        nombre = carrera = null;
        fechaNac = null;
    }

    public Estudiante(int ci, String nombre, String carrera, GregorianCalendar fechaNac) {


        this.ci = ci;
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechaNac = fechaNac;
    }


    public Estudiante(int ci, String nombre, String carrera) {

        this.ci = ci;
        this.nombre = nombre;
        this.carrera = carrera;
        //this.fechaNac = fechaNac;
    }

    public void leerF()
    {
        System.out.println("Fecha de Nacimiento\ndia:");
        int dia = Leer.datoInt();
        System.out.println("mes: ");
        int mes = Leer.datoInt();
        System.out.println("año: ");
        int año = Leer.datoInt();

        this.fechaNac = new GregorianCalendar(año , mes , dia);

    }

    public void leer()
    {
        System.out.println("\nDatos Estudiante:");
        System.out.println("ci: ");
        ci = Leer.datoInt();
        System.out.println("nombre: ");
        nombre = Leer.dato();
        System.out.println("carrera: ");
        carrera = Leer.dato();
        System.out.println("Fecha de Nacimiento\ndia:");
        int dia = Leer.datoInt();
        System.out.println("mes: ");
        int mes = Leer.datoInt();
        System.out.println("año: ");
        int año = Leer.datoInt();

        fechaNac = new GregorianCalendar(año , mes , dia);
    }

    public void mostrar()
    {

        System.out.println("\nDatos EStudiante:");
        System.out.println("ci: "+ci);
        System.out.println("nombre: "+nombre);
        System.out.println("carrera: "+carrera);
        System.out.println("edad" + getEdadHoy());
    }

    public int getCi() {
        return ci;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public int getEdadHoy()
    {
        GregorianCalendar hoy = new GregorianCalendar();
        GregorianCalendar auxNac = fechaNac;
        auxNac.set(Calendar.YEAR, hoy.get(Calendar.YEAR));

        auxNac.set(d);
        int edad = hoy.get(Calendar.YEAR)- fechaNac.get(Calendar.YEAR);
        System.out.println("edad ss"+ edad);
        if (hoy.before(auxNac)) {
            edad -= 1;
        }

        return edad;
    }


}