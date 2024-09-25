import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Pulga {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int contador =0;
		int[] numeros = {1,2,3,4,5};
		int []invertido = new int [5];
		for (int i =numeros.length-1; i>=0;i--) {
			 invertido[contador]=numeros[i];
			contador++;
		}
		System.out.println(Arrays.toString(invertido));
		
	}
}
