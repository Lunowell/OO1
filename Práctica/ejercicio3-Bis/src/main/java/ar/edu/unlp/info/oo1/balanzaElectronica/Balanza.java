package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	List <Producto> productos;
	

	public Balanza () {
		this.productos = new ArrayList <Producto> ();
	}
	
	
	public double getPrecioTotal () {
		return this.productos.stream().mapToDouble(precio -> precio.getPrecio()).sum();
	}
	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(peso -> peso.getPeso()).sum();
	}
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public void ponerEnCero () {
		this.productos.clear();
	}
	public void agregarProducto (Producto producto) {
		this.productos.add(producto);
	}
	public List<Producto> getProducto(){
		return this.productos;
	}
	
	public Ticket emitirTicket () {
		return new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal(),this.getProducto());
	}
}
