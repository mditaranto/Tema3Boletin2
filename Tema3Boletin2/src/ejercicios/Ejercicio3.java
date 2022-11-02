package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int suma;
		int nummax;
		int aux;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero maximo. Se sumaran todos los numeros desde el 1 hasta ese numero");
		nummax = sc.nextInt();
		aux = 0;
		suma = 0;
		do {
			aux++;
			suma += aux;
		
		} while (aux<nummax);
		System.out.println(suma);
		
		sc.close();


	}

}
