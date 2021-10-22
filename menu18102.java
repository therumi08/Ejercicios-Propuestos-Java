import java.util.Scanner;

import javax.swing.JOptionPane;

public class menu18102 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int menu, num1, num2, num3, num4;
		
		System.out.println("1. Mitjà aritmética de 4 números inserits: ");
		System.out.println("2. Canvi de signe a un número enter: ");
		System.out.println("3. Concatenació de tres números d’un digit: ");
		System.out.println("4. Número aleatori entre 50 i 100: ");
		System.out.println("   Seleccione una opció (1, 2, 3, 4:)");
		menu = sc.nextInt();
		
		
		switch(menu) 
		{
		case 1:
			
			System.out.println("Introduce el primer numero para calcular la media: ");
			num1 = sc.nextInt();
			System.out.println("Introduce el segundo numero para calcular la media: ");
			num2 = sc.nextInt();
			System.out.println("Introduce el tercer numero para calcular la media: ");
			num3 = sc.nextInt();
			System.out.println("Introduce el cuarto numero para calcular la media: ");
			num4 = sc.nextInt();
			int total = num1 + num2 + num3 + num4 / 4;
			System.out.println("La media de los 4 numeros insertados es: " +total);
			
		break;	
		
		
		case 2:
			
			System.out.println("Introduce el primer numero para cambiar de signo a un número entero: ");
			num1 = sc.nextInt();
			int total2 = num1 * -1;
			System.out.println("El total es: " +total2);
			
			
		break;	
		
		
		case 3:
			
			System.out.println("Introduce el primer numero para concatenar: ");
			num1 = sc.nextInt();
			System.out.println("Introduce el segundo numero para concatenar: ");
			num2 = sc.nextInt();
			System.out.println("Introduce el tercer numero para concatenar: ");
			num3 = sc.nextInt();
			int total3 = num1*100+num2*10+num3*1;
			System.out.println("El total de la concatenación es: " +total3);
		
			
			
		break;	
		
		
		case 4:
			
			
			System.out.println("Generacion de un número aleatorio entre 50 i 100: ");
			int num = (int) (Math.random()*50+50);
			System.out.print(num);
			
			
		break;
		
		default:
			JOptionPane.showMessageDialog(null," ERROR ! " );
		
		
		}

	}

}
