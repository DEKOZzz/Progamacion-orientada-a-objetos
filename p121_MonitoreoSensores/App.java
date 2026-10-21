package p121_MonitoreoSensores;
public class App {
    public static void main(String[] args) {
        // Sensor 1: valor 28.40 °C, rango de 18.00 a 27.00 °C[cite: 2]
        SensorTemperatura temp1 = new SensorTemperatura(28.40, 18.00, 27.00);
        SensorTemperatura sensor1Medible = temp1;
        SensorTemperatura sensor1Alertable = temp1;

        // Sensor 2: valor 22.50 °C, rango de 18.00 a 24.00 °C[cite: 2]
        SensorTemperatura temp2 = new SensorTemperatura(22.50, 18.00, 24.00);
        SensorTemperatura sensor2Medible = temp2;
        SensorTemperatura sensor2Alertable = temp2;

        // Mostrar resultados
        System.out.printf("Sensor 1: %.2f %s | %s\n", 
            sensor1Medible.leerValor(), 
            sensor1Medible.getUnidad(), 
            sensor1Alertable.estaEnAlerta() ? "ALERTA" : "NORMAL");

        System.out.printf("Sensor 2: %.2f %s | %s\n", 
            sensor2Medible.leerValor(), 
            sensor2Medible.getUnidad(), 
            sensor2Alertable.estaEnAlerta() ? "ALERTA" : "NORMAL");
    }
}