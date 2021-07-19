package UD9.exercice2;

public class Exercice2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie series[] = new Serie[5];
		Videojuego juegos[] = new Videojuego[5];
		Serie ser1 = new Serie();
		series[0] = ser1;
		Serie ser2 = new Serie("The Witcher", "Project");
		series[1] = ser2;
		Serie ser3 = new Serie("The Witcher", 1, "Aventura", "Project");
		series[2] = ser3;
		Serie ser4 = new Serie("The Cacatua", "Ejemplo");
		series[3] = ser4;
		Serie ser5 = new Serie("The Cacatua", 1, "Misterio", "Ejemplo123");
		series[4] = ser5;

		Videojuego jueg1 = new Videojuego();
		juegos[0] = jueg1;
		Videojuego jueg2 = new Videojuego("The Witcher 3", 200);
		juegos[1] = jueg2;
		Videojuego jueg3 = new Videojuego("The Witcher", 50, "Aventura", "Project");
		juegos[2] = jueg3;
		Videojuego jueg4 = new Videojuego("The last of us", 1000);
		juegos[3] = jueg4;
		Videojuego jueg5 = new Videojuego("Minecraft", 10000, "Aventura", "Mojang");
		juegos[4] = jueg5;

		System.out.println("-------------------VIDEOJUEGO----------------------\n");
		for (int i = 0; i < juegos.length; i++) {

			System.out.println(juegos[i] + "\n");

		}

		System.out.println("----------------------SERIE-------------------\n");
		for (int i = 0; i < series.length; i++) {

			System.out.println(series[i] + "\n");
		}

		jueg1.entregar();
		jueg4.entregar();
		ser1.entregar();
		ser4.entregar();
		ser5.entregar();
		System.out.println("//////////////////////////////////////////////////////////////\n");
		for (int i = 0; i < juegos.length; i++) {

			if (juegos[i].isEntregado()) {
				System.out.println("-------------------VIDEOJUEGO ENTREGADO----------------------\n");
				System.out.println(juegos[i] + "\n");
			}

			if (series[i].isEntregado()) {
				System.out.println("----------------------SERIE ENTREGADA-------------------\n");
				System.out.println(series[i] + "\n");
			}
		}
		Videojuego maxJ = new Videojuego();
		for (int i = 0; i < juegos.length; i++) {
			if (juegos[i].compareTo(maxJ) == 1)
				maxJ = juegos[i];
		}
		System.out.println("El videojuego con mayor numero de horas es: \n");
		System.out.println(maxJ + "\n");

		Serie maxS = new Serie();
		for (int i = 0; i < series.length; i++) {
			if (series[i].compareTo(maxS) == 1)
				maxS = series[i];
		}
		System.out.println("La serie con mayor numero de temporadas es: \n");
		System.out.println(maxS + "\n");
	}

}
