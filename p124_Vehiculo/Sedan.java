package p124_Vehiculo;

public class Sedan extends Maquina implements Familiar {

    public Sedan(String nombre, String propietario, int pasajeros) {
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
    public void carroceriaTres() {
        System.out.println("Es un vehículo familiar con carrocería de tres volúmenes.");
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es un vehículo familiar con chasis monocasco.");
    }

    @Override
    public String toString() {
        return "Máquina [Tipo Sedan, Nombre " + nombre + ", Propietario " + propietario + ", Pasajeros=" + pasajeros + "]";
    }
}