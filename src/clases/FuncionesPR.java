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
		if (y == 0) {
			ArrayList<Integer> tupla = new ArrayList<Integer>();
			tupla.add(x);
			return funcionIdentidad(0, tupla);
		} else {
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
		if (y == 0) {
			return funcionCero();
		} else {
			ArrayList<Integer> tupla = new ArrayList<Integer>();
			tupla.add(x);
			tupla.add(y - 1);
			tupla.add(funcionProducto(x, y - 1));
			return funcionSuma(funcionIdentidad(0, tupla), funcionIdentidad(2, tupla));
		}
	}

	/*
	 * Funcion potencia
	 */
}
