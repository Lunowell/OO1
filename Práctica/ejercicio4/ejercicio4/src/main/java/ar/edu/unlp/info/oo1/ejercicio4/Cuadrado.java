package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuadrado implements Figura{
	private double lado;
	
	public Cuadrado (double Lado) {
		this.lado = Lado;
	}
	public Cuadrado () {
		
	}
	
	public double getLado() {
		return this.lado;
	}
	public void setLado(double Lado) {
		this.lado = Lado;
	}
	public double getPerimetro() {
		return (this.lado*4);
	}
	public double getArea() {
		return (this.lado*this.lado);
	}
}