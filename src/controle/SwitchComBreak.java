package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("informe a nota: ");
		int nota = entrada.nextInt();
		String conceito = "";

		switch (nota) {
		case 10:
			conceito = "A";
			break;
		case (9):
			conceito = "A";
			break;
		case (8):
		case (7):
			conceito = "B";
			break;
		case (6):
		case (5):
			conceito = "c";
			break;
		case (4):
		case (3):
			conceito = "D";
			break;
		case (2):
		case (1):
		case (0):
			conceito = "E";
			break;

		default:
			conceito = "nao informado!";

		}

		System.out.println("conceito é " + conceito);
		entrada.close();

	}

}