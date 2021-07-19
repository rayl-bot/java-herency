package UD9.exercice4;

public class Raices {
	/***
	 * Declaracion de los atributos}
	 */
	protected double a, b, c;

	/***
	 * Constructor con todos los parametros
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(double c) {
		this.c = c;
	}

	/***
	 * metodo para obtener los dos resultados
	 */
	public void obtenerRaices() {
		double disc = getDiscriminante();
		double X1,X2;
		X1 = (-b + Math.sqrt(disc))/2*a;
		X2 = (-b - Math.sqrt(disc))/2*a;
		System.out.println("La ecuacion tiene dos soluciones: ");
		System.out.println("Resultado 1: "+X1);
		System.out.println("Resultado 2: "+X2);
	}

	/***
	 * metodo para obtener el resultado de la raiz cuadrada
	 */
	public void obtenerRaiz() {
		double X1;
		X1 = (-b) / 2*a;
		System.out.println("La ecuacion solo tiene una solucion: ");
		System.out.println("Resultado: "+X1);
	}

	/***
	 * \ metodo que devuelve el discriminante
	 * 
	 * @return double
	 */
	public double getDiscriminante() {
		// tiene la siguiente formula, (b^2) 4*a*c
		return (Math.pow(this.b, 2) - 4 * this.a * this.c);
	}

	/***
	 * metodo que dice si tiene mas de una raiz o no
	 * 
	 * @return boolean
	 */
	public boolean tieneRaices() {
		if (getDiscriminante() > 0)
			return true;
		else
			return false;
	}

	/***
	 * metodo que dice si tiene una raiz o no
	 * 
	 * @return boolea
	 */
	public boolean tieneRaiz() {
		if (getDiscriminante() == 0)
			return true;
		else
			return false;
	}

	/***
	 * metodo que muestra los resultados de las ecuaciones
	 */
	public void calcular() {
		if(tieneRaices())
			obtenerRaices();
		else if(tieneRaiz())
			obtenerRaiz();
		else
			System.out.println("ESTA ECUACION NO TIENE SOLUCION");
	}

}
