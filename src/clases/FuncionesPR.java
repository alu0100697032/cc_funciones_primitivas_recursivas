package clases;

import java.util.ArrayList;

public class FuncionesPR extends FuncionesBase {

	/*
	 * Constructor
	 */

	public FuncionesPR() {
		super();
	}

	/*
	 * Funcion suma
	 */

	public int funcionSuma(int x, int y) {
		if (y == 0) { // caso suma(x, 0), devuelve x
			ArrayList<Integer> tupla = new ArrayList<Integer>();
			tupla.add(x);
			return funcionIdentidad(0, tupla);
		} else {// otro caso, recursividad
			// Formamos t-upla
			ArrayList<Integer> tupla = new ArrayList<Integer>();
			tupla.add(x);
			tupla.add(y - 1);
			tupla.add(funcionSuma(x, y - 1));

			return funcionSucesor(funcionIdentidad(2, tupla));
		}
	}

	/*
	 * Funcion producto
	 */

	public int funcionProducto(int x, int y) {
		if (y == 0) {// caso producto(x, 0), devuelve 0
			return funcionCero();
		} else {// otro caso, recursividad
			// Formamos t-upla
			ArrayList<Integer> tupla = new ArrayList<Integer>();
			tupla.add(x);
			tupla.add(y - 1);
			tupla.add(funcionProducto(x, y - 1));

			return funcionSuma(funcionIdentidad(0, tupla),
					funcionIdentidad(2, tupla));
		}
	}

	/*
	 * Funcion potencia
	 */

	public int funcionPotencia(int x, int y) {
		if (y == 0) {// caso potencia(x, 0), devuelve 1, sucesor de cero
			return funcionSucesor(funcionCero());
		} else {// otro caso, recursividad
			// Formamos t-upla
			ArrayList<Integer> tupla = new ArrayList<Integer>();
			tupla.add(x);
			tupla.add(y - 1);
			tupla.add(funcionPotencia(x, y - 1));

			return funcionProducto(funcionIdentidad(0, tupla),
					funcionIdentidad(2, tupla));
		}
	}
}
