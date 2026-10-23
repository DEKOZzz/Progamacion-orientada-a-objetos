package p124_Vehiculo;

public class Maquina {
    protected String nombre;
    protected String propietario;
    protected int pasajeros;

    public Maquina() {
    }

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }

    public void repostar() {
        System.out.println("Repostando");
    }

    public void arrancar() {
        System.out.println("Arrancando");
    }

    public void frenar() {
        System.out.println("Frenando");
    }

    @Override
    public String toString() {
        return "Máquina [Nombre=" + nombre + ", Propietario=" + propietario + ", Pasajeros=" + pasajeros + "]";
    }
}