import java.util.Scanner;

public class picos {
	public static boolean casoDePrueba(Scanner in) {
// Variable que controla si el caso hay que analizarlo o finaliar
		boolean continuar = true;
		int picos = 0;
// Se lee la candidad de piezas o el caso especial que es 0
		int cantidad = in.nextInt();
// Si es el caso especial, no se ejecuta nada y continuar = false
		if (cantidad == 0)
			continuar = false;
		else {
// Declaración del array con las alturas de las montañas
			int[] alturas = new int[cantidad];
// Lectura de las cotas (diferentes alturas)
			for (int i = 0; i < alturas.length; i++) {
				alturas[i] = in.nextInt();
			}
// Proceso -> Búsqueda de picos
			for (int i = 0; i < cantidad-1; i++) {
				if (i == 0) {
					if (alturas[i] > alturas[i + 1]) {
						picos++;
					}
				}
				if (i == cantidad) {
					if (alturas[i] > alturas[i - 1]) {
						picos++;
					}
				}

				if ((i != 0) && (i != cantidad)) {
					if ((alturas[i] > alturas[i + 1]) && (alturas[i] > alturas[i - 1])) {
						picos++;
					}

				}
			}

// Caso cicular 1: El primero debe ser mayor que el último y mayor que el segundo
// Caso ciruclar 2: El último debe ser mayor que el anterior y mayor que el primero
// Casos intermedios
// Salida
			System.out.println(picos);
		}
		return continuar;
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
// Casos de prueba limitado por un caso especial
		while (casoDePrueba(in))
			;
	}
}