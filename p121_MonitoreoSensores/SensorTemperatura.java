package p121_MonitoreoSensores;

public class SensorTemperatura implements Medible, Alertable {
    private double valor;
    private double minimo;
    private double maximo;

    public SensorTemperatura(double valor, double minimo, double maximo) {
        this.valor = valor;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public double leerValor() {
        return valor;
    }

    @Override
    public String getUnidad() {
        return "°C";
    }

    @Override
    public boolean estaEnAlerta() {
        // En alerta si el valor es menor que el mínimo o mayor que el máximo[cite: 2]
        return valor < minimo || valor > maximo;
    }
}

interface Medible {
    double leerValor();
    String getUnidad();
}

interface Alertable {
    boolean estaEnAlerta();
}