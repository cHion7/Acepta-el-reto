import java.util.Arrays;
import java.util.Scanner;

public class burbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aux = 0;

        // Pedir al usuario la cantidad de números
        System.out.println("Cuantos numeros vas a meter?");
        int cantidad = scanner.nextInt();

        // Crear un array para almacenar los números
        int[] nums = new int[cantidad];

        // Pedir al usuario que ingrese los números
        System.out.println("Dime los " + cantidad + " numeros:");
        for (int i = 0; i < cantidad; i++) {
            nums[i] = scanner.nextInt();
        }

        // Algoritmo de ordenación de burbuja
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad - 1; j++) {
                // Comparar elementos adyacentes y intercambiar si están en el orden incorrecto
                if (nums[j] > nums[j + 1]) {
                    aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = aux;
                }
            }
        }

        // Imprimir el array ordenado
        System.out.println(Arrays.toString(nums));
        
        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }
}

