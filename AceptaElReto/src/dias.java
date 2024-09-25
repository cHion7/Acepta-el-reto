import java.util.Scanner;
public class dias {
public static void casoDePrueba(Scanner S) {
	int total=0;
// Array que contiene los días de cada mes del año
int DaysMonth[] = { 0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
// Lectura del día
int day = S.nextInt();
// Lectura del mes
int month = S.nextInt();
// Variable que contiene el total con el resultado
int aux=0;

for(int i =month;i<=11;i++) {
	
	aux =+aux+DaysMonth[i];
	System.out.println(aux);
	
}
if (month==12) {
	total=31-day;
}
else {
	total=aux-day+31;
	
}
 
//Proceso -> Obtén en total, la cantidad de días que faltan utilizando el array
//Salida
System.out.println("Faltan "+total+" dias para fin de año");
}

public static void main(String args[]) {
Scanner S = new Scanner(System.in);
//Casos de prueba limitado
int numCasos = Integer.parseInt(S.nextLine());
for (int i = 0; i < numCasos; i++)
casoDePrueba(S);
}
}