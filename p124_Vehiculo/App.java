package p124_Vehiculo;

public class App {
    public static void main(String[] args) {
        // Prueba Sedan
        Sedan sedan = new Sedan("Vochito", "María Díaz", 4);
        System.out.println(sedan);
        sedan.encender();
        sedan.desplazarse();
        sedan.carroceriaTres();
        sedan.chasisMonocasco();
        sedan.repostar();
        sedan.arrancar();
        sedan.frenar();

        System.out.println();

        // Prueba SUV
        Suv suv = new Suv("La Mamalona", "Carlos Castañeda", 6);
        System.out.println(suv);
        suv.encender();
        suv.desplazarse();
        suv.traccion4x4();
        suv.chasisIndependiente();
        suv.repostar();
        suv.arrancar();
        suv.frenar();
    }
}