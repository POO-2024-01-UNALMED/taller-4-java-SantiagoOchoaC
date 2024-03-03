package classroom;

public class Persona {

    public long cedula;  // Quitamos el final y cambiamos su visibilidad debido al llamado que se le hace desde Taller4.java
    String nombre;
    static int totalPersonas;
    static {
        totalPersonas = 0;
    }

    public Persona() {    // Agregamos un constructor que no recibe parametros
    	this.cedula = 0;
    	totalPersonas++;
    }
    
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1; //Agregamos la siguiente asignación 
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
