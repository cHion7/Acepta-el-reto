import java.util.Arrays;

public class ejercicios {
	public static void main(String[] args) {
		int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9,4 };
		int aux = 0;
		int[] intercambio = new int[11];
//Utiliza este for para realizar el intercambio tal y como muestra el gráfico
		if (numeros.length % 2 == 0) {
			aux = numeros.length / 2;
			System.out.println(aux);
		} else {
			aux = (int) Math.ceil(numeros.length/2);
			System.out.println(aux);
			
		}
		for (int i = aux; i < numeros.length; i++) {
			intercambio[i-aux] = numeros[i];
		}

		for (int i = 0; i < aux; i++) {

			intercambio[i+aux] = numeros[i];

		}
		numeros=intercambio;
		System.out.println(Arrays.toString(numeros));
	}
}