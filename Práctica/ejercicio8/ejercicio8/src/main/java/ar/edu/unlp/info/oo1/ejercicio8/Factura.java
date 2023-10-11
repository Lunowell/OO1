package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.LocalDate;
public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private java.time.LocalDate fecha;
	private Usuario usuario;
	
	public Factura (double unMontoEnergiaActiva, double unDescuento, Usuario unUsuario){
		this.montoEnergiaActiva = unMontoEnergiaActiva;
		this.descuento = unDescuento;	
		this.usuario = unUsuario;
		this.fecha = LocalDate.now();
	}
	
	public Factura () {
		
	}

	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public double montoTotal () {
		return (this.montoEnergiaActiva - (this.montoEnergiaActiva *(this.getDescuento()/100)));
	}
	
	public Usuario getUsuario () {
		return usuario;
	}
	
	
}
