package tema4;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		System.out.println("Escribe un número del 1 al 10");
				int num1 = sc.nextInt();
				
				
		        for (int i = num1;i>0;i--) {
		           
		            for (int j = 0; j <i; j++) {
		                System.out.print("* ");
		            }
		           
		            System.out.println();
		       
		        }
		        sc.close();
		    }
		}
	
	
	
	
	
