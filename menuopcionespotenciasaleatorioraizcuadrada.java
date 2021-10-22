//Importar scanner
import java.util.Scanner;

public class menuopcionespotenciasaleatorioraizcuadrada {

	public static void main(String[] args) {
		
		//Declarar variables
		int cuadrado, op;
		float n1,base;

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1. Potència d'un número elevat a un altre: ");
		System.out.println("2. Arrel quadrada d'un número: ");
		System.out.println("3. Generació d'un número aleatori entre 1 i 20: ");
		System.out.println("4. Generació d'un número aleatori entre 5 i 10: ");
		System.out.println("Seleccione una opció (1, 2, 3, 4:)");
		op = sc.nextInt();
		if (op==1)
		{
			
			
			System.out.println("Ingrese la base: ");
			base = sc.nextFloat();
			System.out.println("Ingrese el exponente: ");
			n1=sc.nextFloat();
			float resultado = (float) Math.pow(base, n1);
			System.out.println(base + " elevado a la " + n1 + " es igual a " + resultado);
			
		}
		if (op==2)
		{
		
			
			System.out.println("Introduce un numero para calcular la raiz cuadrada: ");
	        cuadrado = sc.nextInt();
	        double resultado2 = Math.sqrt(cuadrado);
	        System.out.println("La raíz cuadrada de " + cuadrado + " es " + resultado2);
	        
		}
		if (op==3)
		{
			System.out.println("Generar numero aleatorio entre 1 y 10 ");
	        int num = (int) (Math.random()*10+1);
	        System.out.print(num);
		}
		if (op==4)
		{
			   System.out.println("Generar numero aleatorio entre 20 y 30 ");
		        int num2 = (int) (Math.random()*20+10);
		        System.out.print(num2);
			
		}
		
	}

}
