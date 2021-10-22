//Importar scanner
import java.util.Scanner;
public class menucondici {

	public static void main(String[] args) {
		
		int cuadrado, op, a, b, c;
		float n1,base;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. Suma de tres números: ");
		System.out.println("2. Arrel quadrada d'un número: ");
		System.out.println("3. Potencia de dos números: ");
		System.out.println("4. Generació d'un número aleatori entre 1 i 5: ");
		System.out.println("5. Generació d'un número aleatori entre 10 i 30: ");
		System.out.println("   Seleccione una opció (1, 2, 3, 4:)");
		op = sc.nextInt();
		
		
		
		if (op==1)
		{
			
			System.out.println("Introduce el primer numero para sumar: ");
			a = sc.nextInt();
			System.out.println("Introduce el segundo numero para sumar: ");
			b = sc.nextInt();
			System.out.println("Introduce el tercero numero1 para sumar: ");
			c = sc.nextInt();
			int total = a + b + c;
			System.out.println("La suma total es de: " +total);
			
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
			

			System.out.println("Ingrese la base: ");
			base = sc.nextFloat();
			System.out.println("Ingrese el exponente: ");
			n1=sc.nextFloat();
			float resultado = (float) Math.pow(base, n1);
			System.out.println(base + " elevado a la " + n1 + " es igual a " + resultado);
			
			
		}
		if (op==4)
		{
			
			System.out.println("Generacion de un número aleatorio entre 1 i 5: ");
			int num = (int) (Math.random()*5+1);
			System.out.print(num);
			
		}
		if (op==5)
		{
			
			System.out.println("Generacion de un número aleatorio entre 10 i 30: ");
			int num = (int) (Math.random()*30+10);
			System.out.print(num);
			
			
		}
		
			if ((op!=1) && (op!=2) && (op!=3) && (op!=4) && (op!=5)) {
			
			System.out.println("ERROR");

		}
		

	}
}
