package parqueadero;
// Clase Piso
public class Piso {
    private int numero;
    private int capacidad;

    public Piso(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public void agregarVehiculo() {
        System.out.println("Vehículo agregado al piso " + numero);
    }
}
