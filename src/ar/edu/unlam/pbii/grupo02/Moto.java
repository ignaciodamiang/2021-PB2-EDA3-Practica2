package ar.edu.unlam.pbii.grupo02;

public class Moto extends Vehiculo {

	private String patente;
	private Integer velocidadMaxima;
	static final Integer CANTIDAD_MAXIMA_DE_PASAJEROS = 2;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getPatente() {
		return patente;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

}
