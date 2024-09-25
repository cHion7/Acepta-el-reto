import java.util.Scanner;

public class Te_odio {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        // Lee la cantidad de veces que se ejecutará el programa
        int veces = S.nextInt();
        S.nextLine(); // Consumir el salto de línea

        // Realiza el proceso la cantidad de veces especificada
        do {
            // Lee la frase y la palabra a buscar
            String Frase = S.nextLine();
            String Buscar = S.nextLine();

            // Llama a la función Rastreador e imprime el resultado
            if (Rastreador(Frase, Buscar)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            veces--; // Decrementa el contador de repeticiones
        } while (veces > 0);
    }

    // Función para rastrear la presencia de la palabra a buscar en la frase
    private static boolean Rastreador(String frase, String buscar) {
        // Divide la frase en letras individuales
        String[] Letras = frase.split("");
        String[] Busca = buscar.split("");
        boolean entrada = true;
        String verificar = "";

        // Itera sobre las letras de la palabra a buscar
        for (int i = 0; i < Busca.length; i++) {
            if (!verificar.equalsIgnoreCase(buscar)) {
                entrada = true;

                // Itera sobre las letras de la frase
                for (int j = 0; j < Letras.length; j++) {
                    if (entrada) {
                        // Si encuentra una coincidencia, agrega la letra a verificar y evita duplicaciones
                        if (Letras[j].equalsIgnoreCase(Busca[i])) {
                            verificar += Letras[j];
                            entrada = false;
                        }
                    }
                }
            }
        }
        
        // Comprueba si la palabra a verificar es igual a la palabra buscada
        return verificar.equalsIgnoreCase(buscar);
    }
}

