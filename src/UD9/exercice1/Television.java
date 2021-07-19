package UD9.exercice1;

public class Television extends Electrodomestico {
	/***
	 * pulgadas hace referencia a las pulgadas 
	 * TDT hace referencia a al sintonizador
	 */
	protected double pulgadas;
	protected boolean TDT;
	
	/***
	 * Copnstructor por defecto
	 * @param pulgadas
	 * @param tDT
	 */
	public Television() {
		super();
		this.pulgadas = 20;
		this.TDT = false;
	}
	
	/***
	 * Constructor con dos parametros
	 * @param price
	 * @param size
	 */
	public Television(double price, double size) {
		super(price, size);
		this.pulgadas = 20;
		this.TDT = false;
	}
	
	/***
	 * Constructor con todos los parametros
	 * @param price
	 * @param color
	 * @param consum
	 * @param size
	 * @param pulgadas
	 * @param tDT
	 */
	public Television(double price, String color, String consum, double size, double pulgadas, boolean tDT) {
		super(price, color, consum, size);
		this.pulgadas = pulgadas;
		TDT = tDT;
	}
	
	/***
	 * metodo getPulgadas
	 * @return pulgadas
	 */
	public double getPulgadas() {
		return pulgadas;
	}
	
	/***
	 * metodo isTDT
	 * @return TDT
	 */
	public boolean isTDT() {
		return TDT;
	}
	
	/***
	 * Metodo para clacular el precio final
	 */
	public double precioFinal() {
		super.precioFinal();//llamamos al metodo padre para que ejecute primero el precio final principal
		if(this.pulgadas>40)
			this.price+=(price*0.3);
		if(this.TDT)
			this.price+=50;
		return this.price;
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", TDT=" + TDT + ", price=" + precioFinal() + ", color=" + color
				+ ", consum=" + consum + ", size=" + size + "]";
	}
	
}
