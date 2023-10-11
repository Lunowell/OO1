package ar.edu.unlp.info.oo1.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	List <Usuario> usuarios;
	
	public Distribuidora (double unPrecioKWh) {
		this.precioKWh = unPrecioKWh;
		this.usuarios = new ArrayList<Usuario>();
	}
	public Distribuidora () {
		
	}
	public void agregarUsuario(Usuario unUsuario) {
		this.usuarios.add(unUsuario);
	}
	public double getPrecioKW() {
		return precioKWh;
	}
	public void setPrecioKW(double precioKWh) {
		this.precioKWh = precioKWh;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public double consumoTotalActiva() {
		return (this.usuarios
				.stream()
				.mapToDouble(usuario -> usuario.ultimoConsumoActiva())
				.sum());
	}
	
	//PREGUNTAR POR ESTE
	public List<Factura> facturar (){
		return this.usuarios.stream().map(unUsuario -> unUsuario.facturarEnBaseA(this.getPrecioKW())).collect(Collectors.toList());
	}
}
