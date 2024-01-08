package tema4;

import java.util.Scanner;

public class ejer4 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();
		System.out.println("Números del "+ 1 +" al " + num1 + ":");
		for(int i = 1; i <= num1; i++) {
			
				System.out.println(i);
			
		}
			
	sc.close();
	
	}

}
