package p120_SistemaPagos;

class PagoTransferencia implements MetodoPago {
    private double cargoFijo;

    public PagoTransferencia(double cargoFijo) {
        this.cargoFijo = cargoFijo;
    }

    @Override
    public double calcularTotal(double monto) {
        return monto + cargoFijo;
    }

    @Override
    public String getDescripcion() {
        return "Pago por transferencia";
    }
}
