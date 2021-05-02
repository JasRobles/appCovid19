package com.appCovidBeneficiario.Entidades;

public class personas {

	protected String Dui;
	protected String nombre;
	protected String apellido;
	protected String direccion;
	
	public String getDui() {
		return Dui;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDui(String dui) {
		Dui = dui;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
