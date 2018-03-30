package com.lalo.ninja.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Persona {

	@NotNull
	@Size(min=2, max=6)
	private String nombre;
	@NotNull
	@Min(18)
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Se crea constructor vacío para inicializar campos en el Controlador
	public Persona()
	{
		
	}
	
	//Se crea el método toString para poder imprimir objeto en log 
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
