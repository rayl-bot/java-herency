package UD9.exercice5;

public abstract class Persona {
	/***
	 * Declarar las variables
	 */
	protected String nombre, sexo;
	protected int edad;
	protected boolean asistir;

	/**
	 * @param nombre
	 * @param sexo
	 * @param edad
	 */
	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	// metodo que mediante un numero aleatorio dira si el alumno/profe asiste a
	// clase o no
	public abstract boolean noAsistir();

}
