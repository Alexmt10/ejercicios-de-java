package tema4;

public class ejer7 {

	public static void main(String[] args) {
		int producto = 1; 

        for (int num1 = 1; num1 <= 20; num1 += 2) {
            
            producto *= num1; 
        }
        System.out.println("El producto de los 10 primeros números impares es: " + producto);

	}

}
