package tema4;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int multiplicacion = 0;
		
		int num1;

		System.out.println("Introduce un número comprendido entre el 1 y el 10");
		do {
			 num1 = sc.nextInt();
			
			
		}
		
		while (num1<1 ||num1>10);
		
		System.out.println("Tabla de multiplicar de " + num1);
		
		for (int i = 1; i<=10;i++) {
		
		multiplicacion =num1*i;
		
		System.out.println(num1+"*"+i+"="+multiplicacion);
		

		}
		sc.close();
		
		}

}
