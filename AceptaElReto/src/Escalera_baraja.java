import java.util.Arrays;
import java.util.Scanner;
//@Autor Higo Osma
public class Escalera_baraja {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);

		// creacion de los arrays
		String[] escalera = new String[4];
		String[] palo = new String[4];

		Boolean paloIgual = true;
		do {

			int valor = 0;
			int count = 0;
			boolean intermedio = false;

			// lector de palo y escalera
			escalera[0] = S.next();
			if (!(escalera[0].equals("0"))) {
				palo[0] = S.next();

				for (int i = 1; i < escalera.length; i++) {
					escalera[i] = S.next();
					palo[i] = S.next();
				}
			}
			if (!(escalera[0].equals("0"))) {
				// asignacion de valores si se mete una letra
				for (int j = 0; j < escalera.length; j++) {
					if (!esNumero(escalera[j])) {
						if (escalera[j].equals("K"))
							escalera[j] = "13";

						if (escalera[j].equals("Q"))
							escalera[j] = "12";

						if (escalera[j].equals("J"))
							escalera[j] = "11";

						if (escalera[j].equals("A"))
							escalera[j] = "14";
					}
				}
				// se ve si todos los palos son del mismo tipo
				for (int i = 1; i < palo.length; i++) {
					if (palo[i] != null && !palo[i].equals(palo[0])) {
						paloIgual = false;
					}
				}

				// convierte un array de cadenas de texto que representan números a un array de
				// enteros
				int[] cambioNum = new int[escalera.length];
				for (int z = 0; z < escalera.length; z++) {
					cambioNum[z] = Integer.parseInt(escalera[z]);
				}

				// ordenacion de la escalera dado por el usuario
				Arrays.sort(cambioNum);

				// en caso de que sea true esEscalera y paloIgual
				if (esEscalera(cambioNum) && paloIgual) {
					// caso de numero intermedio
					for (int i1 = 0; i1 < cambioNum.length - 1; i1++) {
						if (cambioNum[i1 + 1] - cambioNum[i1] != 1) {
							valor = cambioNum[i1] + 1;
							String letra = deshacerNum(valor);
							System.out.println(letra + " " + palo[0]);
							intermedio = true;
							i1 = cambioNum.length;
						}
					}

					// caso de numero de delante diferenciando de si hay 13 o no
					for (int i1 = 0; i1 < cambioNum.length - 1; i1++) {
						if (cambioNum[i1 + 1] - cambioNum[i1] == 1) {
							int contador = 0;
							for (int f = 0; f < cambioNum.length - 1; f++) {
								contador++;
							}

							if (intermedio == false) {
//								if (cambioNum[(cambioNum.length - 1)] == 14) {
//									System.out.println("2" + palo[0]);
//									i1 = cambioNum.length;
//								} else {
								if (count == 0) {
									cambioNum[contador] +=1;
									String letra = deshacerNum(cambioNum[contador]);
									System.out.println(letra + " " + palo[0]);
									i1 = cambioNum.length;
								}
//								}
							
							}
						}
					} // HAY QUE HACER QUE ESTOS PRINTS Y LOS DEL IF DE ARRIBA SOLO SE EJECUTE UNA VEZ
						// POSIBLEMENTE CON ELSE IF
				} else {
					System.out.println("NADA");
				}
				// se cierra el bucle while al tener 0
			}
		} while (!escalera[0].equals("0"));
		S.close();
	}

	// SE ASEGURA DE QUE SEAN LETRA sean letra: A,J,Q,K
	static boolean esNumero(String cadena) {
		for (char c : cadena.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	// metodo para detectar si se puede hacer escalera
	// revisar aqui
	private static boolean esEscalera(int[] cartas) {
		int count = 0;
		/*
		 * se inicia el bucle y se resta el siguiente numero en el que estamos con el
		 * que estamos si sale 1 bien porque es el siguiente, sino sabes que hay un
		 * huecoen caso de que sea mas de 2 si es mayor de 2 se va fuera, si se ha
		 * repetido que hay mas un salto entonces entonces tampoco puede haber escalera.
		 * Si todo sale bien se devuelve true
		 */

		for (int i = 0; i < cartas.length - 1; i++) {
			if (cartas[i + 1] - cartas[i] != 1) {
				int num = cartas[i + 1] - cartas[i];
				count++;
				if (num > 2 || count >= 2) {
					return false;
				}
			}
		}
		return true;
	}

	static String deshacerNum(int num) {
		String letra = "";

		if (num == 13) {
			letra = "K";
		} else if (num == 12) {
			letra = "Q";
		} else if (num == 11) {
			letra = "J";
		} else if (num == 14) {
			letra = "A";
		} else {
			letra = String.valueOf(num);
		}
		return letra;
	}

}