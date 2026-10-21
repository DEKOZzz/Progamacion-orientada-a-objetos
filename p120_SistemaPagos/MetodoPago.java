package p120_SistemaPagos;

interface MetodoPago {
    double calcularTotal(double monto);
    String getDescripcion();
}