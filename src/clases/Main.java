package clases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FuncionesPR f = new FuncionesPR();
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println("Introduzca x: ");
			int x = input.nextInt();
			System.out.println("Introduzca y: ");
			int y = input.nextInt();
			System.out.println("Potencia de " + x + "^" + y + " = "
					+ f.funcionPotencia(x, y));
			System.out.println("Desea probar otra operación? (s/n)");
			if(input.next().equals("n"))
				break;
		}
	}
}
