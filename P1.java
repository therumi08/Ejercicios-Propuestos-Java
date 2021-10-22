package avaluacio1;

//Importar utilidad scanner 
import java.util.Scanner;


//Crear clase 
public class P1 {
	
	public static void main(String[] args) {

		
		
		//Crear el lector
		Scanner sc = new Scanner(System.in);
		//Preguntar como se llama
		System.out.println("Como te llamas?");
		//Crear variable string con el nombre introducido en el paso anterior
		String nombre = sc.next();
		//Bienvenida al nombre introducido
		System.out.println("Hola " +nombre);
		//Preguntar que edad tiene
		System.out.println("Que edad tienes?");
		//Crear variable int con la edad introducida
		int edad = sc.nextInt();
		//Si eres mayor de 18 años te da la bienvenida sinos te dice que no eres bienvenido
		if (edad>18) {
			System.out.println("Eres mayor de edad, BIENVENIDO a DAW1 " +nombre);
			}
		
		else {
			System.out.println("Eres menor de edad, lo sentimos, NO eres BIENVENIDO a DAW1 " +nombre);
			break;
		}
		//Preguntar numero a multiplicar
		System.out.println("Introduce tu numero: ");
		//Guardar en la variable n1 el numero introducido
		int n1 = sc.nextInt();
		//Preguntar el otro numero a multiplicar
		System.out.println("Introduce tu otro numero: ");
		//Guardar en la variable n2 el numero introducido
		int n2 = sc.nextInt();
		//Multiplicar resultado n1*n2
		int resultado1 = n1;
		int resultado2 = n2;
		//Mostrar resultado al usuario
		System.out.println("Tu resultado de la multiplicación: " + (resultado1*resultado2));
		System.out.println("Tu resultado de la división: " + (resultado1/resultado2));
		System.out.println("Tu resultado de la suma: " + (resultado1+resultado2));
		System.out.println("Tu resultado de la resta: " + (resultado1-resultado2));
		
		
		
		
		
		
		
	
	}

}
