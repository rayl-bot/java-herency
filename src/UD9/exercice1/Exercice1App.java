package UD9.exercice1;

public class Exercice1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * array de objetos
		 */
		Electrodomestico arrayEle [] = new Electrodomestico[10];
		Electrodomestico tele1 = new Television();
		arrayEle[0] = tele1;
		Electrodomestico tele2 = new Television(20.0, 50.0);
		arrayEle[1] = tele2;
		Electrodomestico tele3 = new Television(100, "Amarillo", "A", 30.53, 60.5, false);//250
		arrayEle[2] = tele3;
		Electrodomestico lava1 = new Lavadora();
		arrayEle[3] = lava1;
		Electrodomestico lava2 = new Lavadora(20.0, 50.0);
		arrayEle[4] = lava2;
		Electrodomestico lava3 = new Lavadora(100, "Amarillo", "A", 30.53, 60.5);//300
		arrayEle[5] = lava3;
		Electrodomestico ele1 = new Electrodomestico();
		arrayEle[6] = ele1;
		Electrodomestico ele2 = new Electrodomestico(20.0, 50.0);
		arrayEle[7] = ele2;
		Electrodomestico ele3 = new Electrodomestico(50,"negro","B",30.8);//180
		arrayEle[8] = ele3;
		Electrodomestico ele4 = new Electrodomestico(100,"amarillo","A",80.3);//300
		arrayEle[9] = ele4;
		
		for (int i = 0; i < arrayEle.length; i++) {
			System.out.println(arrayEle[i]);
		}
		
	}

}
