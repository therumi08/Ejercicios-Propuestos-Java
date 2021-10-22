import java.util.Scanner;

public class positivoonegativo {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero positivo: ");
		numero = teclado.nextInt();
		
		if(numero>0)
		{
			System.out.println("Este numero es positivo");
			
		}
		else 
		{
			
			System.out.println("Este numero es negativo");
			
		}

	}

}
