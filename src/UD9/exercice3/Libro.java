package UD9.exercice3;

public class Libro {
	/***
	 * Declaracion de variables
	 */
	protected String ISBM;
	protected String titulo;
	protected String autor;
	protected int numPages;
	
	/***
	 * Constructor por defecto
	 */
	public Libro() {
		this.ISBM = "";
		this.titulo = "";
		this.autor = "";
		this.numPages = 0;
	}

	/***
	 * Constructor con todos loa parametros
	 * @param iSBM
	 * @param titulo
	 * @param autor
	 * @param numPages
	 */
	public Libro(String iSBM, String titulo, String autor, int numPages) {
		super();
		ISBM = iSBM;
		this.titulo = titulo;
		this.autor = autor;
		this.numPages = numPages;
	}

	/**
	 * @return the iSBM
	 */
	public String getISBM() {
		return ISBM;
	}

	/**
	 * @param iSBM the iSBM to set
	 */
	public void setISBM(String iSBM) {
		ISBM = iSBM;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numPages
	 */
	public int getNumPages() {
		return numPages;
	}

	/**
	 * @param numPages the numPages to set
	 */
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBM " + ISBM + " creado por el autor " + autor + " tiene " + numPages+" paginas.";
	}
	
	/***
	 * metodo compareTo para comparar los numeros de las paginas
	 * @param o
	 * @return integer
	 */
	public int compareTo(Libro o) {
		if(this.numPages>o.numPages)
			return 1;
		else if(this.numPages<o.numPages)
			return -1;
		else 
			return 0;
	}

}
