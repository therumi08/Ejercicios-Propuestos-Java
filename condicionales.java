import java.util.Scanner;

public class condicionales {

	public static void main(String[] args) {
	
	int n,n1,n2;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Introduce un número:\n");
	n=sc.nextInt();
	
	// Usodeloperadorlógico && (Y)
	
	if ((n>=1) && (n<=10)){System.out.println("El número introducido está entre 1 y 10");}
	
	// Usodeloperadorlógico || (O)
	
	if ((n>=1) || (n<=10)){System.out.println("El número introducido es mayor o igual a  1 o menor igual a 10");}
	
	// Usodeloperadorrelacionaldiferente (!=)
	
	System.out.println("Introduce un número:\n");
	n1=sc.nextInt();
	
	if (n1!=0){System.out.println("El número introducido es diferente de 0");}
	else
	{System.out.println("El número introducido es igual a 0");}
	
	// Usodeloperadorlógiconegación (!)
	
	System.out.println("Introduce un número:\n");
	n2=sc.nextInt();
	if (!(n2==10)){System.out.println("El número introducido es diferente a 10");

	}

	}
}


