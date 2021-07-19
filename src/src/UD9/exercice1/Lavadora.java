package UD9.exercice1;

public class Lavadora extends Electrodomestico {
	/***
	 * valor default de carga
	 */
	protected static final double DEFAULT_CARGA = 5;
	protected double carga;
	
	/***
	 * Constructor por defecto
	 * @param carga
	 */
	public Lavadora() {
		this.carga = DEFAULT_CARGA;
	}

	/***
	 * Constructor con parametros heredados
	 * @param price
	 * @param color
	 * @param consum
	 * @param size
	 * @param carga
	 */
	public Lavadora(double price, String color, String consum, double size, double carga) {
		super(price, color, consum, size);
		this.carga = carga;
	}
	
	/***
	 * Constructor con 2 parametros
	 * @param price
	 * @param size
	 */
	public Lavadora(double price, double size) {
		super(price, size);
	}
	
	/***
	 * metodo getCarga
	 * @return carga
	 */
	public double getCarga() {
		return carga;
	}
	
	/***
	 * metodo precioFinal
	 */
	public double precioFinal() {
		super.precioFinal();//llamamos al metodo padre para que ejecute primero el precio final principal
		if(this.carga>30)
			this.price+=50;
		return this.price;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", price=" + precioFinal() + ", color=" + color + ", consum=" + consum + ", size="
				+ size + "]";
	}
	
	
	
}
