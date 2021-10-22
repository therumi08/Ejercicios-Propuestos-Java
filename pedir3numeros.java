//Importar utilidad scanner 
import java.util.Scanner;



public class pedir3numeros {

	public static void main(String[] args) {
		
		//Crear el lector
		Scanner sc = new Scanner(System.in);
		
		//Declarar variables 
		int n1;
		int n2;
		int n3;
		
		//Pedir numeros al usuario
		System.out.println("Dime un numero: ");
		n1=sc.nextInt();
		System.out.println("Dime el segundo numero: ");
		n2=sc.nextInt();
		System.out.println("Dime en tercer numero: ");
		n3=sc.nextInt();
		
		//Declarar condicion 
		if ((n1>n2) && (n2>n3))
		{
			System.out.println("El mayor es: "+n1);
			System.out.println("El mediano es: "+n2);
			System.out.println("El menor es: "+n3);
		}
		if ((n1>n3) && (n3>n2))
		{
			System.out.println("El mayor es: "+n1);
			System.out.println("El mediano es: "+n2);
			System.out.println("El menor es: "+n3);
		}	
		if ((n2>n1) && (n1>n3))
		{
			System.out.println("El mayor es: "+n1);
			System.out.println("El mediano es: "+n2);
			System.out.println("El menor es: "+n3);
		}
		if ((n2>n3) && (n3>n1))
		{
			System.out.println("El mayor es: "+n1);
			System.out.println("El mediano es: "+n2);
			System.out.println("El menor es: "+n3);
		}
		if ((n3>n1) && (n1>n2))
		{
			System.out.println("El mayor es: "+n1);
			System.out.println("El mediano es: "+n2);
			System.out.println("El menor es: "+n3);
		}
		if ((n3>n2) && (n2>n3))
		{
			System.out.println("El mayor es: "+n1);
			System.out.println("El mediano es: "+n2);
			System.out.println("El menor es: "+n3);
		}

	}

}
