package p115_SegundoExamenParcia;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Administradora de la Flota vehicular.
 * Utiliza polimorfismo para gestionar listas heterogéneas de vehículos.
 */
public class Flota {
    private String nomDivision;
    private String ciudadBase;
    private List<Vehiculo> listaUnidades;

    public Flota(String nombre, String ciudad) {
        this.nomDivision = nombre;
        this.ciudadBase = ciudad;
        this.listaUnidades = new ArrayList<>();
    }

    public String getNomDivision() {
        return nomDivision;
    }

    public void setNomDivision(String nomDivision) {
        this.nomDivision = nomDivision;
    }

    public String getCiudadBase() {
        return ciudadBase;
    }

    public void setCiudadBase(String ciudadBase) {
        this.ciudadBase = ciudadBase;
    }

    public List<Vehiculo> getListaUnidades() {
        return listaUnidades;
    }

    public void registrarUnidad(Vehiculo unidad) {
        this.listaUnidades.add(unidad);
    }

    // Alias para el método exigido por la especificación del examen
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.registrarUnidad(vehiculo);
    }

    public double getTotalBono() {
        double acumulado = 0.0;
        for (Vehiculo elem : listaUnidades) {
            acumulado += elem.calcularBonoDriver();
        }
        return acumulado;
    }

    public double getTotalCosto() {
        double acumulado = 0.0;
        for (Vehiculo elem : listaUnidades) {
            acumulado += elem.getCuotaTotal();
        }
        return acumulado;
    }

    public int getNumCamiones() {
        int contador = 0;
        for (Vehiculo elem : listaUnidades) {
            if (elem instanceof CamionCarga) {
                contador++;
            }
        }
        return contador;
    }

    public int getNumAutobuses() {
        int contador = 0;
        for (Vehiculo elem : listaUnidades) {
            if (elem instanceof AutobusPasajeros) {
                contador++;
            }
        }
        return contador;
    }

    public void reporte() {
        System.out.println(">> Reporte Detallado de la Flota <<");
        for (Vehiculo elem : listaUnidades) {
            System.out.println(elem.toString());
        }
    }

    @Override
    public String toString() {
        return "Flota [Nombre Divisi\u00f3n " + nomDivision + ", Ciudad " + ciudadBase +
               ", Veh\u00edculos=" + listaUnidades.size() +
               ", BonoTotal=" + getTotalBono() +
               ", CostoTotal=" + getTotalCosto() +
               ", Camiones=" + getNumCamiones() +
               ", Autobuses=" + getNumAutobuses() + "]";
    }
}