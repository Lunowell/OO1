package ar.edu.unlp.info.oo1.ejercicio4;

public class Circulo implements Figura{
	private double radio;
	
	public Circulo (double Radio) {
		this.radio = Radio;
	}
	public Circulo () {
		
	}
	public double getDiametro() {
		return (this.radio*2);
	}
	public double getRadio() {
		return this.radio;	
	}
	public double getArea() {
		return (Math.PI*(this.radio*this.radio));
	}
	public double getPerimetro() {
		return ((this.radio*2)*Math.PI);
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setDiametro (double i) {
		this.setRadio(i/2);
	}

}
