package parqueadero;

public class Ticket {
    private int codigo;
    private String fechaHoraEntrada;
    private String fechaHoraFinal;
    private float valor;

    public Ticket(int codigo, String fechaHoraEntrada, String fechaHoraFinal, float valor) {
        this.codigo = codigo;
        this.fechaHoraEntrada = fechaHoraEntrada;
        this.fechaHoraFinal = fechaHoraFinal;
        this.valor = valor;
    }

    public void mostrarDetalles() {
        System.out.println("Ticket #" + codigo + ": Entrada " + fechaHoraEntrada + ", Salida " + fechaHoraFinal + ", Valor: $" + valor);
    }
}
