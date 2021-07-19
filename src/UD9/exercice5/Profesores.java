package UD9.exercice5;

public class Profesores extends Persona {
	protected String materia;

	/***
	 * Constructor con 3 parametros
	 * @param nombre
	 * @param sexo
	 * @param edad
	 */
	public Profesores(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
		this.asistir = noAsistir();
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
	
}
