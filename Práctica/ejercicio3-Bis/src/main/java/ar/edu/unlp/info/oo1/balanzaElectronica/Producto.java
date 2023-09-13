package ar.edu.unlp.info.oo1.balanzaElectronica;
 
public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	

	public Producto (double Peso, double Precio, String Descripcion) {
		this.peso = Peso;
		this.precioPorKilo = Precio;
		this.descripcion = Descripcion;
	}

	
	public Producto() {
		// TODO Auto-generated constructor stub
	}


	public String getDescripcion () {
		return this.descripcion;
	}
	
	public void setDescripcion (String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getPrecio() {
		return (this.peso * this.precioPorKilo);
	}


	public void setPeso(int i) {
		this.peso = i;
		
	}


	public void setPrecioPorKilo(int i) {
		this.precioPorKilo=i;
		
	}


	public void setPeso(double d) {
		this.peso = d;
		
	}
	


	public double getPrecioPorKilo() {
		// TODO Auto-generated method stub
		return (this.precioPorKilo);
	}

}
