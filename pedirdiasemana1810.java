import java.util.Scanner;

import javax.swing.JOptionPane;

public class pedirdiasemana1810 {

	public static void main(String[] args) {

		int num=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" | Introduce el numero entre el 1 y 7 |");
		num = sc.nextInt();		
		switch(num) 
		{
		case 1:
			JOptionPane.showMessageDialog(null,"Lunes" );
			JOptionPane.showMessageDialog(null,"Hoy es dia laborable!" );
		break;	
		
		
		case 2:
			JOptionPane.showMessageDialog(null,"Martes" );
			JOptionPane.showMessageDialog(null,"Hoy es dia laborable!" );
		break;	
		
		
		case 3:
			JOptionPane.showMessageDialog(null,"Miercoles" );
			JOptionPane.showMessageDialog(null,"Hoy es dia laborable!" );
		break;	
		
		
		case 4:
			JOptionPane.showMessageDialog(null,"Jueves" );
			JOptionPane.showMessageDialog(null,"Hoy es dia laborable!" );
		break;	
		
		
		case 5:
			JOptionPane.showMessageDialog(null,"Viernes" );
			JOptionPane.showMessageDialog(null,"Hoy es dia laborable!" );
		break;	
		
		case 6:
			JOptionPane.showMessageDialog(null,"Sabado" );
			JOptionPane.showMessageDialog(null,"Hoy es un dia festivo!" );
		break;	
		
		case 7:
			JOptionPane.showMessageDialog(null,"Domingo" );
			JOptionPane.showMessageDialog(null,"Hoy es un dia festivo!" );
		break;	
		default:
			JOptionPane.showMessageDialog(null,"Error! La semana no tiene tantos dias! :)" );
			
		}
		
		
			
		
			
	}
	
}	

	
	

