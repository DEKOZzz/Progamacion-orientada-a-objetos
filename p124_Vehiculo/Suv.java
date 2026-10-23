package p124_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {

    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo el vehículo");
    }

    @Override
    public void desplazarse() {
        System.out.println("Desplazándose");
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un vehículo todoterreno con tracción 4x4.");
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un vehículo todoterreno con chasis independiente.");
    }

    @Override
    public String toString() {
        return "Máquina [Tipo Suv, Nombre " + nombre + ", Propietario " + propietario + ", Pasajeros=" + pasajeros + "]";
    }
}