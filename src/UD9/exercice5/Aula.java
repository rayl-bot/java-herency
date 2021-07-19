package UD9.exercice5;

public class Aula {
	/***
	 * Creamos las variable
	 */
	protected int identifier, maxAlumns;
	protected String materia;

	/**
	 * Constructor por defecto
	 */
	public Aula() {
		this.identifier = 1;
		this.maxAlumns = 10;
		this.materia = "Filosofia";
	}

	/**
	 * @param identifier
	 * @param maxAlumns
	 * @param materia
	 */
	public Aula(int identifier, int maxAlumns, String materia) {
		super();
		this.identifier = identifier;
		this.maxAlumns = maxAlumns;
		this.materia = materia;
	}
	
	
	//GETTERS Y SETTERS
	/**
	 * @return the identifier
	 */
	public int getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier the identifier to set
	 */
	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return the maxAlumns
	 */
	public int getMaxAlumns() {
		return maxAlumns;
	}

	/**
	 * @param maxAlumns the maxAlumns to set
	 */
	public void setMaxAlumns(int maxAlumns) {
		this.maxAlumns = maxAlumns;
	}

	/**
	 * @return the materia
	 */
	public String getMateria() {
		return materia;
	}

	/**
	 * @param materia the materia to set
	 */
	public void setMateria(String materia) {
		this.materia = materia;
	}

}
