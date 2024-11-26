package parqueadero;

// Clase Persona
abstract class Persona {
    protected String nombre;
    protected String telefono;
    protected String cedula;

    public Persona(String nombre, String telefono, String cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
    }
}
