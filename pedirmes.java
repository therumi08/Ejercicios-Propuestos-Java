import java.util.Scanner;

public class pedirmes {

	public static void main(String[] args) {

		int num=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" | Introduce un numero entre el 1 y 12 |");
		num = sc.nextInt();		
		switch(num) 
		{
		case 1:
		System.out.println("Enero");
		break;	
		
		
		case 2:
		System.out.println("Febrero");
		break;	
		
		
		case 3:
		System.out.println("Marzo");
		break;	
		
		
		case 4:
		System.out.println("Abril");
		break;	
		
		
		case 5:
		System.out.println("Mayo");
		break;	
		
		case 6:
		System.out.println("Junio");
		break;	
		
		case 7:
		System.out.println("Julio");
		break;	
		
		case 8:
		System.out.println("Agosto");
		break;	
		
		case 9:
		System.out.println("Septiembre");
		break;	
		
		case 10:
		System.out.println("Octubre");
		break;	
		
		case 11:
		System.out.println("Noviembre");
		break;	
		
		case 12:
		System.out.println("Diciembre");
		break;	
		}
		
		if (num>=12) {
			
			System.out.println("Debes introducir numeros entre el 1 y el 12 sinos no te va a funcionar :)");
		}
			
		
			
	}
	
}	

	
	

