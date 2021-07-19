package UD9.exercice2;

public class Serie implements Entregable {
	private String titulo;
	private int numTemp;
	private boolean entregado;
	private String genero;
	private String creador;

	/***
	 * Constructor por defecto
	 */
	public Serie() {
		super();
		this.titulo = "";
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	/***
	 * Constructor con dos parametros
	 * 
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.numTemp = 3;
		this.entregado = false;
		this.genero = "";
	}

	/***
	 * Constructor con todos los parametros
	 * 
	 * @param titulo
	 * @param numTemp
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int numTemp, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemp = numTemp;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	/***
	 * metodo getTitulo
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/***
	 * metodo getNumTemp
	 * 
	 * @return numTemp
	 */
	public int getNumTemp() {
		return numTemp;
	}

	public void setNumTemp(int numTemp) {
		this.numTemp = numTemp;
	}

	/***
	 * metodo getGenero
	 * 
	 * @return genero
	 */
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	/***
	 * metodo getCreador
	 * 
	 * @return creador
	 */
	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie con titulo " + titulo + " que tiene " + numTemp + " temporadas, clasificado por el genero "
				+ genero + " creado por " + creador;
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
		Serie serie = (Serie) a;
		if (this.numTemp == serie.numTemp)
			return 0;
		else if (this.numTemp > serie.numTemp)
			return this.numTemp;
		else
			return serie.numTemp;

	}

}
