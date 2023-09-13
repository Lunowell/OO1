package ar.edu.unlp.info.oo1.balanzaElectronica;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Ticket {
	private java.time.LocalDate fecha;
	List <Producto> productos;
	private int cantTotal;
	private double precioTotal;
	private double pesoTotal;
	
	
	public Ticket (int CantTotal, double PesoTotal, double PrecioTotal, List <Producto>productos) {
		this.cantTotal = CantTotal;
		this.precioTotal = PrecioTotal;
		this.pesoTotal = PesoTotal;
		this.productos = new ArrayList <Producto> ();
		this.fecha = LocalDate.now();
	}
	
	public double impuesto () {
		return (getPrecioTotal()* 0.21);
		
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return cantTotal;
	}

	public void setCantTotal(int cantTotal) {
		this.cantTotal = cantTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
}
