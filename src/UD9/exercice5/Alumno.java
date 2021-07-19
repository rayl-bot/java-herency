package UD9.exercice5;

public class Alumno extends Persona {
	protected double nota;

	/***
	 * Constructor con 3 parametros
	 * @param nombre
	 * @param sexo
	 * @param edad
	 */
	public Alumno(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
		this.asistir = noAsistir();
		this.nota = randomNota();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean noAsistir() {
		// TODO Auto-generated method stub
		int valorDado = (int)Math.floor(Math.random()*10+1);
		//condicion que hara que devuelva true o false dependiendo de si va a asistir o no
		if(valorDado<2)
			return true;//devuelve true
		else
			return false;// devuelve false
	}
	
	public double randomNota() {
		return Math.floor(Math.random()*11);
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + nota + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}

}
