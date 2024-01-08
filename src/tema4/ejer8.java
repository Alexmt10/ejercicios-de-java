package tema4;

import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Introduce un número para hacer su factorial");
		int num1 = sc.nextInt();
		long factorial =1;
		for (int i = 1; i <= num1 ; i ++) {
		
			factorial*=i;
		}	
			System.out.println(factorial );
		
		
		sc.close();
		

	}

}
