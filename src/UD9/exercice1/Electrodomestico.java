package UD9.exercice1;

enum Color{
	BLANCO, NEGRO, AZUL, ROJO, GRIS;
}

enum Consum{
	A,B,C,D,E,F;
}

public class Electrodomestico {
	// contantes que se van a utilizar
	protected static final double PRICE_BASE = 100;
	protected static final double SIZE = 5;

	protected double price;
	protected String color;
	protected String consum;
	protected double size;

	public Electrodomestico() {
		this.color = Color.BLANCO.toString();
		this.consum = Consum.F.toString();
		this.price = PRICE_BASE;
		this.size = SIZE;
	}

	public Electrodomestico(double price, double size) {
		super();
		this.price = price;
		this.size = size;
		this.color = Color.BLANCO.toString();
		this.consum = Consum.F.toString();
	}

	public Electrodomestico(double price, String color, String consum, double size) {
		super();
		this.price = price;
		this.color = confirmColor(color);
		this.consum = confirmConsum(consum);
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = confirmColor(color);
	}

	public String getConsum() {
		return consum;
	}

	public void setConsum(String consum) {
		this.consum = confirmConsum(consum);
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	private String confirmColor(String color) {
		if (color.equalsIgnoreCase(Color.BLANCO.toString()))
			return color;
		else if (color.equalsIgnoreCase(Color.NEGRO.toString()))
			return color;
		else if (color.equalsIgnoreCase(Color.AZUL.toString()))
			return color;
		else if (color.equalsIgnoreCase(Color.ROJO.toString()))
			return color;
		else if (color.equalsIgnoreCase(Color.GRIS.toString()))
			return color;
		else
			return Color.BLANCO.toString();
	}

	private String confirmConsum(String consum) {
		if (consum.contains(Consum.A.toString()))
			return consum;
		else if (consum.contains(Consum.B.toString()))
			return consum;
		else if (consum.contains(Consum.C.toString()))
			return consum;
		else if (consum.contains(Consum.D.toString()))
			return consum;
		else if (consum.contains(Consum.E.toString()))
			return consum;
		else if (consum.contains(Consum.F.toString()))
			return consum;
		else
			return Consum.F.toString();
	}
	
	public double precioFinal() {
		//condicionar el consumo y cambiar el precio a raiz de eso
		switch (this.consum.toUpperCase()) {
		case "A":
			this.price+=100;
			break;
		case "B":
			this.price+=80;
			break;
		case "C":
			this.price+=60;
			break;
		case "D":
			this.price+=50;
			break;
		case "E":
			this.price+=30;
			break;
		case "F":
			this.price+=10;
			break;
		}
		//condicion para comprobar el rango del size y cambiar el precio final
		if(this.size>0 && this.size <= 19)
			this.price+=10;
		else if(this.size>20 && this.size <= 49)
			this.price+=50;
		else if(this.size>50 && this.size <= 79)
			this.price+=80;
		else if(this.size>80)
			this.price+=100;
		
		return this.price;
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [price=" + precioFinal() + ", color=" + color + ", consum=" + consum + ", size=" + size + "]";
	}

}
