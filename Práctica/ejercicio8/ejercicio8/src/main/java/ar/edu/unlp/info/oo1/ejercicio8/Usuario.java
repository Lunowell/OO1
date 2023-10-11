package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String domicilio;
	private String nombre;
	List<Factura> facturas;
	List<Consumo> consumos;
	
	public Usuario (String unDomicilio, String unNombre) {
		this.domicilio = unDomicilio;
		this.nombre = unNombre;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
	}
	
	public Usuario () {
		
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarFactura(Factura unaFactura) {
		this.facturas.add(unaFactura);
	}
	public List<Factura> facturas() {
		return this.facturas;
	}

	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public List<Consumo> getConsumos() {
		return consumos;
	}
	public Consumo ultimoConsumo() {
		return (consumos
				.stream()
				.max((consumoA, consumoB)-> consumoA.getFecha().compareTo(consumoB.getFecha())).orElse(null));
	}
	public double ultimoConsumoActiva() {
		if (this.ultimoConsumo() == null){
			return 0;
		}
			return this.ultimoConsumo().getConsumoEnergiaActiva();
	}
	
	// PREGUNTAR COMO SE HACE  
	public Factura facturarEnBaseA (double unPrecioKW) {
		Factura factura;
		Consumo ultimoConsumo = this.ultimoConsumo();
		if (ultimoConsumo == null) {
			factura = new Factura (0,0,this);
		}
		else {
			int descuento = 0;
			if (ultimoConsumo.factorDePotencia() > 0.8) {
				descuento = 10;
			}
			factura = new Factura(this.ultimoConsumo().costoEnBaseA(unPrecioKW),descuento,this);
		}
		return factura;
	}
}
