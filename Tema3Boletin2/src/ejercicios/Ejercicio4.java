package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num;
		int nummult;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero maximo. Se mostrara la tabla de multiplicar de ese numero: ");
		num = sc.nextInt();

		nummult = 0;
		do {
			nummult++;
			System.out.println(num + "*" + nummult + " = " + (num*nummult));
		} while (nummult<10);
		
		sc.close();


	}

}