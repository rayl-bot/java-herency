package UD9.exercice2;

public interface Entregable {
	/***
	 * metodo para cambiar a true el valor entregado
	 */
	void entregar();
	/***
	 * metodo para cambiar a false el valor entregado
	 */
	void devolver();
	/***
	 * metodo que devuelve el valor actual del valor entregado
	 * @return booleano
	 */
	boolean isEntregado();
	/***
	 * metodo de comparacion
	 * @param a
	 */
	int compareTo(Object a);
}
