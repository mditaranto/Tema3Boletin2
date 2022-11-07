package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		double num;
		String ayuda = "";
		int max = 100;
		int min = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Piensa en un numero, yo intentare adivinarlo. Ayudame indicandome si es [mayor] o [menor] que su numero"
						+ "Cuando lo adivine indiquelo [igual] ");

		num = Math.random() * 100;
		num = (int) num;
		System.out.println(num);
		ayuda = sc.next();

		do {
			if (ayuda.equalsIgnoreCase("mayor")) {
				if (min < num) {
					min = (int) num;
				}

			} else if (ayuda.equalsIgnoreCase("menor")) {
				if (max > num) {
					max = (int) num;
				}
			}
			num = Math.random() * (max - min + 1) + min;
			System.out.println((int) num);
			ayuda = sc.next();
		} while (!ayuda.equalsIgnoreCase("igual"));
		
		System.out.println("Ha sido divertido :)");
		
		sc.close();

	}
}