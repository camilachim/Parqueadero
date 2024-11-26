package parqueadero;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String color;

    public Vehiculo(String matricula, String modelo, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
    }

    public String mostrarDetalles() {
        return "Matrícula: " + matricula + ", Modelo: " + modelo + ", Color: " + color;
    }
}
