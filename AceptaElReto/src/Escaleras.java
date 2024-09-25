public class Escaleras {
	public static void main(String[] args) {
// Ejemplos: el primero debería devolver que Hay Escalera mientras que el segundo no
		int[] cartas1 = { 3, 4, 5, 6, 7 };
		int[] cartas2 = { 3, 5, 6, 7, 8 };
//se llama al metodo es escalera
		System.out.println(esEscalera(cartas2) ? "Hay Escalera" : "No hay Escalera");
	}

	private static boolean esEscalera(int[] cartas) {
		int count = 0;
		/*
		 * bucle for encargado de ver si el numero siguinete en el que estamos es igual a uno
		 * si no es que hay una diferencia de 2 y no hay escalera 
		 */
		for (int i = 0; i < cartas.length - 1; i++) {
			if (cartas[i + 1] - cartas[i] == 1) {
				count++;
				//si esta bien el salto se suma 1
				
			} else {
				return false;
				//si hay saltop de mas de 2 entonces esta mal
			}
		}
// si se han sumado el total de los numeros numeros devolvera true 
		if (count == cartas.length - 1) {
			return true;
		} else {
		}
		return false;
	}

}
