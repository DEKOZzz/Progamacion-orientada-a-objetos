package p120_SistemaPagos;

public class App {
    public static void main(String[] args) {
        double montoCompra = 1000.00;

        MetodoPago pago1 = new PagoTarjeta(0.03);
        MetodoPago pago2 = new PagoTransferencia(15.00);

        System.out.printf("%s: $%.2f\n", pago1.getDescripcion(), pago1.calcularTotal(montoCompra));
        System.out.printf("%s: $%.2f\n", pago2.getDescripcion(), pago2.calcularTotal(montoCompra));
    }
}
