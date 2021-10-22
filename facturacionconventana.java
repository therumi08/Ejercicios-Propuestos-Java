//Importar libreria swing javax

import javax.swing.JOptionPane;

public class facturacionconventana {

	public static void main(String[] args) {
		
		//Declarar variables 

		
		double totalsiniva;
		double totalconiva;
		double totaldescuento;
		double ivaproducto;
		double totalprecio;
		double totaltodo;
		double importdescomptat;
		
		//Pedir datos al usuario

		
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		String identificacion = JOptionPane.showInputDialog("Introduce tu NIF o CIF: ");
		String pedirprecio = JOptionPane.showInputDialog("Introduce el precio del producto: ");
		double precio = Integer.parseInt(pedirprecio);
		String fecha = JOptionPane.showInputDialog("Introduce la fecha: ");
		String hora = JOptionPane.showInputDialog("Introduce la hora: ");
		String pedirref = JOptionPane.showInputDialog("Introduce el numero de referencia: ");
		double ref = Integer.parseInt(pedirref);
		String producto = JOptionPane.showInputDialog("Introduce nombre del producto: ");
		String pedirunidades = JOptionPane.showInputDialog("Introduce el numero de unidades: ");
		double unidades = Integer.parseInt(pedirunidades);
		String pedirporcentaje= JOptionPane.showInputDialog("Introduce el descuento en porcentaje: ");
		double porcentaje = Integer.parseInt(pedirporcentaje);
		String pediriva = JOptionPane.showInputDialog("Introduce el IVA: ");
		double iva = Integer.parseInt(pediriva);
		
		//Realizar los calculos con las variables introducidas
		
		
		JOptionPane.showMessageDialog(null,"Hola " +nombre);
		JOptionPane.showMessageDialog(null,"El precio total es: " +precio);
		JOptionPane.showMessageDialog(null,"El numero de unidades son : " +unidades);
		ivaproducto=precio*unidades/porcentaje;
		JOptionPane.showMessageDialog(null,"El IVA es (porcentaje) : " +iva);
		JOptionPane.showMessageDialog(null,"El IVA de cada producto es: " +ivaproducto);
		totalsiniva=precio*unidades;
		JOptionPane.showMessageDialog(null,"El importe total sin iva es: " +totalsiniva);
		totalconiva=precio*unidades+ivaproducto;
		JOptionPane.showMessageDialog(null,"El importe total con iva es: " +totalconiva);
		JOptionPane.showMessageDialog(null,"El porcentaje del descuento total es : " +porcentaje);
		totaldescuento=totalconiva-totalconiva*porcentaje/100;
		importdescomptat=totalconiva*porcentaje/100;
		JOptionPane.showMessageDialog(null,"El precio total del importe descontado es: " +importdescomptat);
		JOptionPane.showMessageDialog(null,"El importe total con el descuento aplicado es de: " +totaldescuento);

	





		
		

		
		
		
		
		
		
		
		
	}

}
