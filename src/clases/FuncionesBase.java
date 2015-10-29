package clases;

import java.util.ArrayList;

public class FuncionesBase {

	/*
	 * Constructor
	 */

	public FuncionesBase() {

	}

	/*
	 * Funcion base cero
	 */

	public int funcionCero() {
		return 0;
	}

	/*
	 * Funcion base sucesor
	 */

	public int funcionSucesor(int natural) {
		return natural + 1;
	}

	/*
	 * Funcion base identidad generalizada
	 */

	public int funcionIdentidad(int iesimoElemento, ArrayList<Integer> tupla) {
		return tupla.get(iesimoElemento);
	}
}
