package p115_SegundoExamenParcia;

/**
 * Subclase: AutobusPasajeros
 * Implementa las métricas operativas específicas para transporte de pasajeros.
 */
public class AutobusPasajeros extends Vehiculo {
    private int rutasAsignadas;
    private int paxMovilizados;

    public AutobusPasajeros(String marca, String modelo, int capacidad, double costoBase, int rutas, int pasajeros) {
        super(marca, modelo, capacidad, costoBase);
        this.rutasAsignadas = rutas;
        this.paxMovilizados = pasajeros;
        // Costo Total = Costo Base + Bono calculado del conductor
        this.setCuotaTotal(this.getCuotaBase() + this.calcularBonoDriver());
    }

    public int getRutasAsignadas() {
        return rutasAsignadas;
    }

    public void setRutasAsignadas(int rutasAsignadas) {
        this.rutasAsignadas = rutasAsignadas;
    }

    public int getPaxMovilizados() {
        return paxMovilizados;
    }

    public void setPaxMovilizados(int paxMovilizados) {
        this.paxMovilizados = paxMovilizados;
    }

    // Cálculo: (CostoBase * 0.15) + (Rutas * 120) + (Pasajeros * 0.1)
    @Override
    public double calcularBonoDriver() {
        return (getCuotaBase() * 0.15) + (rutasAsignadas * 120.0) + (paxMovilizados * 0.1);
    }

    @Override
    public String toString() {
        return "AutobusPasajeros [" + super.toString() + ", Rutas=" + rutasAsignadas +
               ", Pasajeros Transportados=" + paxMovilizados +
               ", Bono=" + calcularBonoDriver() + ", CostoTotal=" + getCuotaTotal() + "]";
    }
}