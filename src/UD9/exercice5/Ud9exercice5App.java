package UD9.exercice5;

import java.util.*;

public class Ud9exercice5App {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Alumno> alumns = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMenu();
	}

	public static void firstMenu() {
		// primero tendremos que añadir el aula con sus datos
		System.out.println("Introduce el idetificador del aula: ");
		int id = sc.nextInt();
		String materia;

		do {
			System.out.println("Que asignatura se cursara en ese aula? ");
			materia = sc.next();
		} while (materia.equalsIgnoreCase("matematicas") && materia.equalsIgnoreCase("filosofia")
				&& materia.contentEquals("fisica"));

		System.out.println("El numero maximo de alumnos para tu aula son 6 ");
		int maxAlumns = sc.nextInt();

		Aula aula = new Aula(id, maxAlumns, materia);

		// hacemos un bucle que recorra tantas veces como alumnos haya
		for (int i = 0; i < maxAlumns; i++) {
			alumns.add(generateAlumns());
		}

		Profesores profe = generateProfe();
		comprobarDispo(aula, profe);
	}

	public static void comprobarDispo(Aula aula, Profesores profe) {
		if (profe.asistir) {
			if (aula.materia.equalsIgnoreCase(profe.materia)) {
				if (countDispAlumns() >= (int) aula.maxAlumns / 2) {
					int arrayAprob[] = aprobados();
					System.out.println("Hay "+arrayAprob[0]+" chicos, "+arrayAprob[1]+" chicas y "+arrayAprob[2]+" disgeneros aprobados/as.");
				} else {
					System.out.println("No hay alumnos disponibles para este aula");
				}
			} else {
				System.out.println("El profesor no es de la misma materia que la clase");
			}
		} else {
			System.out.println("El profesor no esta disponible");
		}
	}

	public static int countDispAlumns() {
		int count = 0;
		for (int i = 0; i < alumns.size(); i++) {
			if (alumns.get(i).asistir)
				count++;
		}
		return count;
	}

	public static int[] aprobados() {
		int arrayAprob[] = new int[3];

		for (int i = 0; i < alumns.size(); i++) {
			int j = 1;
			if (alumns.get(i).sexo.equalsIgnoreCase("chico") && alumns.get(i).asistir) {
				if (alumns.get(i).nota >= 5)
					arrayAprob[0] += j;
			} else if (alumns.get(i).sexo.equalsIgnoreCase("chica") && alumns.get(i).asistir) {
				if (alumns.get(i).nota >= 5)
					arrayAprob[1] += j;
			} else if (alumns.get(i).sexo.equalsIgnoreCase("otro") && alumns.get(i).asistir) {
				if (alumns.get(i).nota >= 5)
					arrayAprob[2] += j;
			}

		}
		return arrayAprob;
	}

	public static Alumno generateAlumns() {

		// pregunta por pantalla el nombre del alumno
		System.out.println("Nombre del/la alumno/a: ");
		String name = sc.next();
		// pregunta por pantalla el sexo del alumno

		String sexo;
		do {
			System.out.println("Sexo del/la alumno/a (chico/chica/otro): ");
			sexo = sc.next();
		} while (!sexo.equalsIgnoreCase("chico") && !sexo.equalsIgnoreCase("chica") && !sexo.equalsIgnoreCase("otro"));

		int edad;
		// bucle para controlar que pone una edad correcta
		do {
			System.out.println("Edad del/la alumno/a: ");
			edad = sc.nextInt();
		} while (edad < 0 || edad > 18);
		// creamos el objeto alumno con los datos que hemos introducido

		return new Alumno(name, sexo, edad);
	}

	public static Profesores generateProfe() {
		// pregunta por pantalla el nombre del alumno
		System.out.println("Nombre del/la profesor/a: ");
		String name = sc.next();
		String materia;
		// bucle que controla que solo pueda introducir ciertas asignaturas
		do {
			System.out.println("Que asignatura se cursara el/la profesor/a? ");
			materia = sc.next();
		} while (!materia.equalsIgnoreCase("matematicas") && !materia.equalsIgnoreCase("filosofia")
				&& !materia.contentEquals("fisica"));

		String sexo;
		// bucle que controla el genero del/la profesor/a
		do {
			System.out.println("Sexo del/la profesor/a (chico/chica/otro): ");
			sexo = sc.next();
		} while (!sexo.equalsIgnoreCase("chico") && !sexo.equalsIgnoreCase("chica") && !sexo.equalsIgnoreCase("otro"));

		int edad;
		// bucle para controlar que pone una edad correcta
		do {
			System.out.println("Edad del/la profesor/a: ");
			edad = sc.nextInt();
		} while (edad < 20);

		return new Profesores(name, sexo, edad);
	}

}