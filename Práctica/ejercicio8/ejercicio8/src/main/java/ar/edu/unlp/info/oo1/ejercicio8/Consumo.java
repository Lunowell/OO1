package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.LocalDate;

public class Consumo {
	private java.time.LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo (LocalDate unaFecha, double unConsumoActiva, double unConsumoReactiva) {
		this.fecha = unaFecha;
		this.consumoEnergiaActiva = unConsumoActiva;
		this.consumoEnergiaReactiva = unConsumoReactiva;
	}
	public Consumo () {
		
	}
	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}
	
	public double factorDePotencia() {
		return ((this.getConsumoEnergiaActiva()) / (Math.sqrt(this.getConsumoEnergiaActiva () * this.getConsumoEnergiaActiva()) + (this.getConsumoEnergiaReactiva() * this.getConsumoEnergiaReactiva())));
	}
	
	public double costoEnBaseA(double unPrecioKWh) {
		return this.consumoEnergiaActiva * unPrecioKWh;
	}
}
