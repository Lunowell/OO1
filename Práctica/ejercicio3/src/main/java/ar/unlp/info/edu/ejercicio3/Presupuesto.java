package ar.unlp.info.edu.ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Presupuesto {
	private java.time.LocalDate fecha;
	private String cliente;
	List<Item> items ;

	public Presupuesto (String Cliente) {
		this.cliente = Cliente;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
		
	}
	
	public void agregarItem (Item item) {
		items.add(item);
	}
	public double calcularTotal() {
		return this.items.stream().mapToDouble(itemsTotales -> itemsTotales.costo()).sum();
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
}
