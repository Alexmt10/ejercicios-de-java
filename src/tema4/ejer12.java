package tema4;

import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		int suspensos = 0;
		System.out.println("Introduce 5 notas ");
		
		for (int i =1;i<=5;i++) {
	
	    int notas = sc.nextInt();
		
		
		if (notas<5) {
			suspensos++;
			
		}
		}
		System.out.println("Hay " + suspensos+ " suspensos");
		

		
		sc.close();
	}
}