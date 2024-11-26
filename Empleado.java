package parqueadero;

public class Empleado extends Persona {
    private String rol;

    public Empleado(String nombre, String telefono, String cedula, String rol) {
        super(nombre, telefono, cedula);
        this.rol = rol;
    }

    public void asignarReserva() {
        System.out.println("Reserva asignada por el empleado " + nombre);
    }
}
