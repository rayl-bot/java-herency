package UD9.exercice3;

public class UD9exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro lib1 = new Libro("12345","The Witcher","Yo",500);
		Libro lib2 = new Libro("5613463","Hola","Uno Random",12345);
		
		System.out.println("---------------------------------");
		System.out.println(lib1);
		System.out.println("---------------------------------");
		System.out.println(lib2);
		System.out.println("---------------------------------");
		
		if(lib1.compareTo(lib2)==1)
			System.out.println(lib1);
		else if(lib1.compareTo(lib2)==-1)
			System.out.println(lib2);
		else
			System.out.println("Tienen el mismo numero de paginas");
	}

}
