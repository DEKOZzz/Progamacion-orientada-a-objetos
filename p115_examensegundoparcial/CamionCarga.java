package p115_SegundoExamenParcia;

/**
 * Subclase: CamionCarga
 * Implementa las métricas operativas específicas para transporte pesado.
 */
public class CamionCarga extends Vehiculo {
    private int numEjes;
    private double kmRecorridos;

    public CamionCarga(String marca, String modelo, int capacidad, double costoBase, int ejes, double kilometraje) {
        super(marca, modelo, capacidad, costoBase);
        this.numEjes = ejes;
        this.kmRecorridos = kilometraje;
        // Costo Total = Costo Base + Bono calculado del conductor
        this.setCuotaTotal(this.getCuotaBase() + this.calcularBonoDriver());
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    // Cálculo: (CostoBase * 0.10) + (Ejes * 50) + (Kilometraje * 0.5)
    @Override
    public double calcularBonoDriver() {
        return (getCuotaBase() * 0.10) + (numEjes * 50.0) + (kmRecorridos * 0.5);
    }

    @Override
    public String toString() {
        return "CamionCarga [" + super.toString() + ", Ejes=" + numEjes + ", Kilometraje=" + kmRecorridos +
               ", Bono=" + calcularBonoDriver() + ", CostoTotal=" + getCuotaTotal() + "]";
    }
}