package p115_SegundoExamenParcia;

/**
 * Superclase Abstracta Base: Vehiculo
 * Define la estructura fundamental de cada unidad operativa.
 */
public abstract class Vehiculo {
    protected String marcaUnit;
    protected String modeloUnit;
    protected int capCapacidad;
    protected double cuotaBase;
    protected double cuotaTotal;

    public Vehiculo(String marcaUnit, String modeloUnit, int capCapacidad, double cuotaBase) {
        this.marcaUnit = marcaUnit;
        this.modeloUnit = modeloUnit;
        this.capCapacidad = capCapacidad;
        this.cuotaBase = cuotaBase;
        this.cuotaTotal = 0.0;
    }

    // Firma abstracta para el cálculo del bono según el tipo de unidad
    public abstract double calcularBonoDriver();

    public String getMarcaUnit() {
        return marcaUnit;
    }

    public void setMarcaUnit(String marcaUnit) {
        this.marcaUnit = marcaUnit;
    }

    public String getModeloUnit() {
        return modeloUnit;
    }

    public void setModeloUnit(String modeloUnit) {
        this.modeloUnit = modeloUnit;
    }

    public int getCapCapacidad() {
        return capCapacidad;
    }

    public void setCapCapacidad(int capCapacidad) {
        this.capCapacidad = capCapacidad;
    }

    public double getCuotaBase() {
        return cuotaBase;
    }

    public void setCuotaBase(double cuotaBase) {
        this.cuotaBase = cuotaBase;
    }

    public double getCuotaTotal() {
        return cuotaTotal;
    }

    public void setCuotaTotal(double cuotaTotal) {
        this.cuotaTotal = cuotaTotal;
    }

    @Override
    public String toString() {
        return "Vehiculo [Marca=" + marcaUnit + ", Modelo=" + modeloUnit + ", Capacidad=" + capCapacidad + ", CostoBase=" + cuotaBase;
    }
}