import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class p142_Archivos7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "datos.txt";
        int opcion;

        do {
            System.out.println("\n========================================");
            System.out.println("     GESTIÓN DE ARCHIVOS DE TEXTO       ");
            System.out.println("========================================");
            System.out.println("1. Escribir datos en el archivo");
            System.out.println("2. Leer datos del archivo");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, ingrese un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    escribirArchivo(scanner, nombreArchivo);
                    break;
                case 2:
                    leerArchivo(nombreArchivo);
                    break;
                case 3:
                    System.out.println("\nSaliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Método para escribir datos introducidos por el usuario
    public static void escribirArchivo(Scanner scanner, String nombreArchivo) {
        // El parámetro 'true' en FileWriter habilita el modo 'append' (agregar al final)
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            System.out.println("\n--- ESCRIBIR EN EL ARCHIVO ---");
            System.out.println("Introduce los datos que deseas guardar (escribe 'fin' para terminar):");
            String linea;
            
            while (true) {
                System.out.print("> ");
                linea = scanner.nextLine();
                if (linea.equalsIgnoreCase("fin")) {
                    break;
                }
                escritor.write(linea);
                escritor.newLine(); // Salto de línea por cada entrada
            }
            System.out.println("¡Datos guardados exitosamente en '" + nombreArchivo + "'!");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }

    // Método para leer y mostrar el contenido del archivo
    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            System.out.println("\nEl archivo '" + nombreArchivo + "' aún no existe. Escribe datos primero.");
            return;
        }

        System.out.println("\n--- CONTENIDO DEL ARCHIVO (" + nombreArchivo + ") ---");
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("--------------------------------------------------");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
