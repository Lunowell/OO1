package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	
	private String text;
	private int meGusta; //Una variable numérica sin inicialización explicita es 0 
	private boolean featured;
	/**
	 * Complete con su implementación
	 */

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    
    public WallPostImpl () {
    	this.text = "Undefined post";
    	this.meGusta = 0;
    	this.featured = false;
    }
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text=text;
	}

	@Override
	public int getLikes() {
		// TODO Auto-generated method stub
		return this.meGusta;
	}

	@Override
	public void like() {
		this.meGusta++;
		
	}

	@Override
	public void dislike() {
		if (this.meGusta>0)
			this.meGusta--;
		
	
	}

	@Override
	public boolean isFeatured() {
		// TODO Auto-generated method stub
		return this.featured;
	}

	@Override
	public void toggleFeatured() {
		if (!this.featured) //No entiendo porque se escribe esto asi, supongo que es porque lo definí como falso al inicio
			this.featured = true;
		else
			this.featured = false;
		
	}

}
