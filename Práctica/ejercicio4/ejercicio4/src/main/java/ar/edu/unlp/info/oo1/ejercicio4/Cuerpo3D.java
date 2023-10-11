package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	public Cuerpo3D (double unaAltura, Figura unaCaraBasal){
		this.altura = unaAltura;
		this.caraBasal = unaCaraBasal;
	}
	public Cuerpo3D() {
		
	}
	
	
	public void setAltura (double i) {
		this.altura = i;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setCaraBasal(Figura cara) {
		this.caraBasal=cara;
	}
	public Figura getCaraBasal() {
		return caraBasal;
	}
	public double getVolumen() {
		return this.getCaraBasal().getArea()*this.altura;
		
	}
	public double getSuperficieExterior() {
		return ((2*this.getCaraBasal().getArea())+(this.getCaraBasal().getPerimetro()*this.altura));
	}
	
	
}
