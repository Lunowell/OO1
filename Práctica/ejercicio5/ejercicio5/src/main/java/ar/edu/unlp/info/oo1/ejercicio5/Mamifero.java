package ar.edu.unlp.info.oo1.ejercicio5;


public class Mamifero {
	private String identificador;
	private String especie;
	private java.time.LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero (String unIdentificador) {//, String unaEspecie, Mamifero unaMadre, Mamifero unPadre) {
		this.identificador = unIdentificador;
		/*this.especie = unaEspecie;
		this.madre = unaMadre;
		this.padre = unPadre;
		this.fechaNacimiento = LocalDate.now();*/
	}
	
	public Mamifero () {
		
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public java.time.LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(java.time.LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getAbueloMaterno() {
		if (this.getMadre() != null) 
			return this.getMadre().getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre() != null)
			return this.getMadre().getMadre();
		else
			return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre() != null)
			return this.getPadre().getPadre();
		else
			return null;
	}
	
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre() != null)
			return this.getPadre().getMadre();
		else
			return null;
	}
	public boolean ancestroDirecto(Mamifero unMamifero) {
		return (this.getMadre() == unMamifero || this.getPadre() == unMamifero);
	}
	public boolean ancestroMadre (Mamifero unMamifero) {
		return ((this.getMadre() != null) && (this.getMadre().tieneComoAncestroA(unMamifero) == true));
	}
	public boolean ancestroPadre(Mamifero unMamifero) {
		return ((this.getPadre() != null) && (this.getPadre().tieneComoAncestroA(unMamifero) == true));
	}
	
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		return (this.ancestroDirecto(unMamifero) || this.ancestroMadre(unMamifero)|| this.ancestroPadre(unMamifero));
		
	}	
	
}
