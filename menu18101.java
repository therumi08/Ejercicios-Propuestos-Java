import java.util.Scanner;


public class menu18101 {

	public static void main(String[] args) {
		

			Scanner sc=new Scanner(System.in);
			
			int menu, num1, num2;
			
			System.out.println("1. Suma de dos números: ");
			System.out.println("2. Resta de dos números: ");
			System.out.println("3. Producte de dos números: ");
			System.out.println("4. Divisió de dos números: ");
			System.out.println("   Seleccione una opció (1, 2, 3, 4:)");
			menu = sc.nextInt();
			
			switch(menu) 
			{
			case 1:
				
				System.out.println("Introduce el primer numero para sumar: ");
				num1 = sc.nextInt();
				System.out.println("Introduce el segundo numero para sumar: ");
				num2 = sc.nextInt();
				int totalsuma = num1 + num2;
				System.out.println("El total de la suma es: " +totalsuma);
				
			break;	
			
			
			case 2:
				
				System.out.println("Introduce el primer numero para restar: ");
				num1 = sc.nextInt();
				System.out.println("Introduce el segundo numero para restar: ");
				num2 = sc.nextInt();
				int totalresta = num1 - num2;
				System.out.println("El total de la resta es: " +totalresta);
				
			break;	
			
			
			case 3:
				
				System.out.println("Introduce el primer numero para multiplicar: ");
				num1 = sc.nextInt();
				System.out.println("Introduce el segundo numero para multiplicar: ");
				num2 = sc.nextInt();
				int totalmultiplicacion = num1 * num2;
				System.out.println("El total de la resta es: " +totalmultiplicacion);
				
				
				
			break;	
			
			
			case 4:
				
				System.out.println("Introduce el primer numero para dividir: ");
				num1 = sc.nextInt();
				System.out.println("Introduce el segundo numero para dividir: ");
				num2 = sc.nextInt();
				int totaldivision = num1 / num2;
				System.out.println("El total de la división"+ " es: " +totaldivision);
				
			break;	
			
			
			}
			
			
			

	}

}
