package ar.edu.unlam.pbii.grupo02;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mapa {

	private Map<Vehiculo, Integer> vehiculosEnMapa;
	private Boolean hayCoalicion = false;

	public Mapa(String nombreMapa) {
		this.vehiculosEnMapa = new TreeMap<Vehiculo, Integer>();
	}

	public void agregarVehiculo(Vehiculo vehiculoAgregado) {
		vehiculosEnMapa.put(vehiculoAgregado, vehiculoAgregado.hashCode());
	}

	public Boolean hayCoalicion() throws ColitionException {
		Collection<Vehiculo> vehiculos = new TreeSet<Vehiculo>();
		Collection<Integer> hashCodes = new HashSet<Integer>();
		vehiculos = vehiculosEnMapa.keySet();
		for (Vehiculo vehiculo : vehiculos) {
			vehiculosEnMapa.replace(vehiculo, vehiculo.hashCode());
			hashCodes.add(vehiculo.hashCode());
		}
		
		if (vehiculos.size() != hashCodes.size()) {
			hayCoalicion = true;
			throw new ColitionException("Chocaron dos vehículos.");
		}
		return hayCoalicion;
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculosEnMapa.size();
	}

}
