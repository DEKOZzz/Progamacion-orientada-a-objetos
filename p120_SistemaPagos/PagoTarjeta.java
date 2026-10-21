package p120_SistemaPagos;

class PagoTarjeta implements MetodoPago {
    private double comision;

    public PagoTarjeta(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularTotal(double monto) {
        return monto + (monto * comision);
    }

    @Override
    public String getDescripcion() {
        return "Pago con tarjeta";
    }
}