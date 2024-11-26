package parqueadero;

public class Parqueadero {
    private String nombre;
    private String ubicacion;

    public Parqueadero(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void gestionarReservas() {
        System.out.println("Gestionando reservas en " + nombre + " ubicado en " + ubicacion);
    }
}
