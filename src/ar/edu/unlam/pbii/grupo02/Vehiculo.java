package ar.edu.unlam.pbii.grupo02;

public class Vehiculo implements Comparable<Vehiculo> {

	private Double latitud;
	private Double longitud;

	public Vehiculo(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}

	public void actualizarCoordenadas(Double latitudNueva, Double longitudNueva) {
		this.latitud = latitudNueva;
		this.longitud = longitudNueva;
	}

	@Override
	public int compareTo(Vehiculo o) {
		if (this.hashCode() == o.hashCode()) {
			return 0;
		} else if (this.getLatitud() > o.getLatitud()) {
			return 1;
		} else
			return -1;
	}
}
