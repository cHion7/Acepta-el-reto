import java.util.Arrays;
import java.util.Scanner;

public class otrojercicioARRAYS {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int num[] = new int[8];
		int cambio[] = new int[8];
		int aux;
		System.out.println("Dime 8 numeros");
		for(int i =01
				; i<8;i++) {
			System.out.print("Numero "+i+": ");
			num[i]=S.nextInt();
		}
		for (int i = 0; i < num.length - 1; i++) {
			if (i == 0) {
				cambio[0] = num[num.length - 1];

			}
			cambio[i + 1] = num[i];

		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(cambio));
	}

}
