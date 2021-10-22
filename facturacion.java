//Importar libreria scanner
import java.util.Scanner;

public class facturacion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		//Declarar variables 
		
		String nombre;
		String identificacion;
		String fecha;
		String hora;
		int ref;
		String producto;
		int unidades;
		double porcentaje;
		double iva;
		double precio;
		double totalsiniva;
		double totalconiva;
		double totaldescuento;
		double ivaproducto;
		double totalprecio;
		double totaltodo;
		double importdescomptat;
		String edad;
		
		//Pedir datos al usuario
		
	
		
		System.out.println("Introduce tu nombre: ");
		nombre=sc.nextLine();
		System.out.println("Introduce tu NIF o CIF: ");
		identificacion=sc.nextLine();
		System.out.println("Introduce el precio del producto: ");
		precio=sc.nextInt();
		System.out.println("Introduce la fecha: ");
		fecha=sc.next();
		System.out.println("Introduce la hora: ");
		hora=sc.next();
		System.out.println("Introduce el numero de referencia: ");
		ref=sc.nextInt();
		System.out.println("Introduce nombre del producto: ");
		producto=sc.next();
		System.out.println("Introduce el numero de unidades: ");
		unidades=sc.nextInt();
		System.out.println("Introduce el descuento en porcentaje: ");
		porcentaje=sc.nextDouble();
		System.out.println("Introduce el IVA: ");
		iva=sc.nextDouble();
		
		//Realizar los calculos con las variables introducidas
		
		System.out.println("Tu nombre es: " +nombre);
		System.out.println("El precio total es: " +precio);
		System.out.println("El numero de unidades son : " +unidades);
		ivaproducto=precio*unidades/porcentaje;
		System.out.println("El IVA es (porcentaje) : " +iva);
		System.out.println("El IVA de cada producto es: " +ivaproducto);
		totalsiniva=precio*unidades;
		System.out.println("El importe total sin iva es: " +totalsiniva);
		totalconiva=precio*unidades+ivaproducto;
		System.out.println("El importe total con iva es: " +totalconiva );
		
		System.out.println("El porcentaje del descuento total es : " +porcentaje);
		totaldescuento=totalconiva-totalconiva*porcentaje/100;
		importdescomptat=totalconiva*porcentaje/100;
		System.out.println("El precio total del importe descontado es: " +importdescomptat );
		System.out.println("El importe total con el descuento aplicado es de: " +totaldescuento);
		
		
		
		
		
		
		
		

	}

}

