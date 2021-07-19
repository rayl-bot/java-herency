package UD9.exercice2;

public class Videojuego implements Entregable{
	/***
	 * Declaraciones de las variables
	 */
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String company;
	
	/***
	 * Constructor por defecto
	 */
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = 10;
		this.genero = "";
		this.company = "";
	}

	/***
	 * Constructor con dos parametros
	 * @param titulo
	 * @param horasEstimadas
	 */
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = "";
		this.company = "";
	}

	/***
	 * Cosntructor con todos los parametros
	 * @param titulo
	 * @param horasEstimadas
	 * @param entregado
	 * @param genero
	 * @param company
	 */
	public Videojuego(String titulo, int horasEstimadas, String genero, String company) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.company = company;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the horasEstimadas
	 */
	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	/**
	 * @param horasEstimadas the horasEstimadas to set
	 */
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Videojuego con titulo " + titulo + " que tiene unas " + horasEstimadas + " horas, clasificado por el genero "
				+ genero + " creado por " + company;
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		this.entregado = true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return this.entregado;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		Videojuego juego = (Videojuego) a;
		if (this.horasEstimadas == juego.horasEstimadas)
			return 0;
		else if (this.horasEstimadas > juego.horasEstimadas)
			return 1;
		else
			return -1;

	}
	
	
}
