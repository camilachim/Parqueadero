package parqueadero;

public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Av. Principal 123");
        parqueadero.gestionarReservas();

        // Crear un piso y agregar un vehículo
        Piso piso1 = new Piso(1, 50);
        piso1.agregarVehiculo();

        // Crear un vehículo
        Vehiculo vehiculo = new Vehiculo("ABC-123", "Toyota Corolla", "Rojo");
        System.out.println(vehiculo.mostrarDetalles());

        // Crear un empleado
        Empleado empleado = new Empleado("Juan Pérez", "0987654321", "1234567890", "Administrador");
        empleado.asignarReserva();

        // Crear un ticket
        Ticket ticket = new Ticket(101, "2024-11-25 08:00", "2024-11-25 18:00", 15.50f);
        ticket.mostrarDetalles();

        // Crear y confirmar una reserva
        Reserva reserva = new Reserva(1, "2024-12-01", "2024-12-05");
        reserva.confirmar();
        reserva.cancelar();
    }
}
