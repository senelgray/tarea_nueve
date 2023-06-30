package tareaNueve;
import java.util.Scanner;

public class MenuSwitch {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		String opcion;
		
		
		System.out.println("Bienvenido a su Restaurante favorito. Seleccione el tipo de comida de su agrado");
		
	
		System.out.println("1. China");
		System.out.println("2. Mexicana");
		System.out.println("3. Italina");
		System.out.println("4. Tailandesa");
		System.out.println("5. Brasilena");
		System.out.println("Elija una operacion a realizar: ");
		int selecomida= input.nextInt();

		switch (selecomida) {
		case 1:
			opcion="arroz frito";
			break;
		case 2:
			opcion ="Tacos";
			break;
		case 3:
			opcion ="Pasta con albondigas";
			break;
		case 4:
			opcion ="Sopa de camarones";
			break;
		case 5:
			opcion ="Feijao";
			break;
		default:
		opcion ="Ningun platillo";
		break;
		
		}
		
		System.out.println("Usted ha seleccionado "+opcion);

	}

}