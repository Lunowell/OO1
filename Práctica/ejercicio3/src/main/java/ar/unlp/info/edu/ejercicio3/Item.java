package ar.unlp.info.edu.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;


	public Item (String Detalle, int Cantidad, double CostoUnitario) {
		this.detalle = Detalle;
		this.cantidad = Cantidad;
		this.costoUnitario = CostoUnitario;
	}

	public double costo () {
		return (this.cantidad * this.costoUnitario);
	}
	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getCostoUnitario() {
		return costoUnitario;
	}


	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
}
