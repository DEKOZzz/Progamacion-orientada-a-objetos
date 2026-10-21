package p115_SegundoExamenParcia;

/**
 * Punto de Entrada de la Aplicación.
 * 
 * ------------------------------------------------------------------------------------
 * JUSTIFICACIÓN TÉCNICA SOBRE POLIMORFISMO Y LATE BINDING (ENLACE TARDÍO)
 * ------------------------------------------------------------------------------------
 * En este programa, la colección `listaUnidades` almacena objetos de subclases distintas
 * (`CamionCarga` y `AutobusPasajeros`) tratados bajo la referencia unificada de la
 * superclase abstracta `Vehiculo`.
 * 
 * Al invocar el método `calcularBonoDriver()` dentro de los bucles iterativos de la clase
 * `Flota`, el entorno de compilación únicamente comprueba la presencia abstracta del método
 * en la clase `Vehiculo`. La decisión concreta sobre qué bloque de código ejecutar NO se
 * determina durante la compilación.
 * 
 * Este proceso ocurre dinámicamente en TIEMPO DE EJECUCIÓN mediante el mecanismo conocido
 * como "Late Binding" (o Enlace Dinámico). La Máquina Virtual de Java (JVM) inspecciona
 * el tipo real del objeto instanciado en la memoria Heap y deriva la llamada a la 
 * implementación correspondiente (@Override) de la clase concreta que responda a esa instancia.
 * ------------------------------------------------------------------------------------
 */
public class App {
    public static void main(String[] args) {
        // Inicialización del gestor de flota
        Flota flotaNorte = new Flota("Norte", "Monterrey");

        // Estado Inicial
        System.out.println("Reporte Inicial");
        System.out.println(flotaNorte);
        System.out.println();

        // Carga de unidades de prueba
        flotaNorte.registrarUnidad(new CamionCarga("Volvo", "FMX", 30000, 2500.0, 4, 5000.0));
        flotaNorte.registrarUnidad(new CamionCarga("Kenworth", "T680", 25000, 1800.0, 3, 4200.0));
        flotaNorte.registrarUnidad(new AutobusPasajeros("Mercedes", "O500", 50, 1200.0, 5, 8500));
        flotaNorte.registrarUnidad(new AutobusPasajeros("Irizar", "i6", 40, 1500.0, 8, 12000));
        flotaNorte.registrarUnidad(new AutobusPasajeros("Scania", "K360", 45, 950.0, 4, 6200));

        // Impresión final de la flota
        System.out.println("Reporte Final con Datos de Prueba");
        flotaNorte.reporte();
        System.out.println(flotaNorte);
    }
}