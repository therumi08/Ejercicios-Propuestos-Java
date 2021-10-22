import java.util.Scanner;

public class versiañoesbisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int año;
		
		System.out.println("Introduce un año para ver si es bisiesto: ");
		año = sc.nextInt();
		
		if ((año % 4 == 0) && ((año%100!=0) || (año % 400 == 0))) {
			
			System.out.println("Es un año bisiesto");
			
		}else 
			
			System.out.println("No es un año bisiesto");

	}

}
