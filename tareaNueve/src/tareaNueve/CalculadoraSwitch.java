package tareaNueve;
import java.util.Scanner;
public class CalculadoraSwitch {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String opcion;
		double Resultado =0;
		
		
		System.out.println("Bienvenido a su calculadora.");
		
		System.out.println("Ingrese el primer numero: ");
		double numero1 = input.nextDouble();
		
		System.out.println("Ingrese el segundo numero: ");
		double numero2 = input.nextDouble();
		
	
		System.out.println("1.  Sumar");
		System.out.println("2.  Restar ");
		System.out.println("3.  Multiplicar ");
		System.out.println("4.  Dividir");
		System.out.println("Elija una operacion a realizar: ");
		int opcionOper= input.nextInt();

		
		switch(opcionOper) {
		case 1:
		opcion ="Sumar";
		Resultado = numero1+numero2;
		break;
		case 2:
		opcion ="Restar";
		Resultado = numero1 - numero2;
		break;
		case 3:
		opcion ="Multiplicar";
		Resultado = numero1*numero2;
		break;
		case 4:
		opcion ="Division";
		Resultado = numero1/numero2;
		break;
		default:
		System.out.println("Opción inválida.");
        break;
		
		}
		
		System.out.println("Usted selecciono: "+opcionOper+ " y el resultado es: "+Resultado);
       

		

}
}
	
