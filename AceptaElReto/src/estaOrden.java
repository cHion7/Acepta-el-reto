import java.util.Arrays;

public class estaOrden {
	public static void main(String[] args) {
		int[] listado1 = { 6, 2, 3, 1, 4, 5, 7 };
		int[] listado2 = { 1, 2, 3, 4, 5, 6, 7 };
		boolean isSort = false;

// Implementa una forma de saber si el array está ordenado o no
// Almacena el resultado en la variable isSort

		if (isSort(listado1))
			System.out.println("El vector está ordenado");
		else
			System.out.println("El vector NO está ordenado");
	}

	public static boolean isSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;

	}
}