package ar.edu.unlp.info.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private List <Farola> neighbors;
	private boolean on;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola () {
		this.neighbors = new ArrayList<Farola>();
		this.on = false;
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino 
	* de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if (! this.neighbors.contains(otraFarola)) {
			this.neighbors.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return this.neighbors;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (! this.on) {
			this.on =true;	
			this.getNeighbors().forEach(l -> l.turnOn());
		}

	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (this.on) {
			this.on =false;	
			this.getNeighbors().forEach(l -> l.turnOff());
		}

	}
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.on;
	}


}
