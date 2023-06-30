package tareaNueve;
import java.util.Scanner;

public class convertirNumeroSemana {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		String dia;
		
		System.out.println("Ingrese el numero del 1 al 7: ");
		
		String diaSem= scanner.nextLine();
		
		switch (diaSem) {
		case "1":
			
			dia="1";
			break;
		case "2":
			dia ="Martes";
			break;
		case "3":
			dia ="Miercoles";
			break;
		case "4":
			dia ="Jueves";
			break;
		case "5":
			dia ="Viernes";
			break;
		case "6":
			dia ="Sabado";
			break;
		case "7":
			dia ="Domingo";
			break;
		default:
		dia ="No estas escribiendo ningun dia";
		break;
		
		}
		
		System.out.println("El dia de la semana: "+diaSem+" es el dia "+dia);

	}

}