//Importar utilidad scanner 
import java.util.Scanner;

public class pediredad {

	public static void main(String[] args) {
		
		//Crear el lector
		Scanner sc = new Scanner(System.in);
		//Declarar variable
		int edad;
		//Pedir edad al usuario
		System.out.println("Que edad tienes? ");
		edad=sc.nextInt();
		//Declarar condición
		if (edad>=18) {
			
			System.out.println("Eres mayor de edad!");
		}
		else{
			
			System.out.println("No puedes acceder al sistema debido a que eres menor de edad!");
			
		}

	}

}
