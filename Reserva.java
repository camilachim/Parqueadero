package parqueadero;

public class Reserva {
    private int numero;
    private String fechaInicio;
    private String fechaFinal;

    public Reserva(int numero, String fechaInicio, String fechaFinal) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public void confirmar() {
        System.out.println("Reserva #" + numero + " confirmada para el período: " + fechaInicio + " - " + fechaFinal);
    }

    public void cancelar() {
        System.out.println("Reserva #" + numero + " cancelada.");
    }
}
