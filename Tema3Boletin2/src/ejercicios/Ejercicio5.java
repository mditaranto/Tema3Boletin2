package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		double num;
		String ayuda = "";
		int menor = 0;
		int mayor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero maximo. Se mostrara la tabla de multiplicar de ese numero: ");

		num = Math.random()*100;
		num = (int)num;
		System.out.println(num);
		ayuda = sc.next();
		if (ayuda.equalsIgnoreCase("menor")) {
			mayor = (int)num;
			num = Math.random()*num-1;
			System.out.println((int)num);
			ayuda = sc.next();
			do {
				menor = (int)num;
				num = Math.random()*(100-num+1)+num;
				System.out.println((int)num);
				ayuda = sc.next();
			} while (ayuda.equalsIgnoreCase("mayor"));
		}
		if (ayuda.equalsIgnoreCase("mayor")) {
			menor = (int)num;
			num = Math.random()*(100-num+1)+num;
			System.out.println((int)num);
			ayuda = sc.next();
			do {
				mayor = (int)num;
				num = Math.random()*(100-num+1)+num;
				System.out.println((int)num);
				ayuda = sc.next();
			} while (ayuda.equalsIgnoreCase("menor"));
		}
		do {
			
		} while (ayuda.equalsIgnoreCase("menor"));
		
		do {
			if (ayuda.equalsIgnoreCase("menor")) {
				mayor = (int)num;
				num = Math.random()*(mayor-menor+1)+menor;
			} else if (ayuda.equalsIgnoreCase("mayor")) {
				menor = (int)num;
				num = Math.random()*(mayor-menor+1)+menor;
			}
			System.out.println((int)num);
			ayuda = sc.next();
		} while (!ayuda.equalsIgnoreCase("igual"));
		
		
		
		sc.close();


	}

}