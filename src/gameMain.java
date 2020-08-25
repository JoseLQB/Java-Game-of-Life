import java.util.Random;
import java.util.Scanner;

public class gameMain {

	public static void main(String[] args) {
		//Siguiente, generar los números a partir de una línea
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//col y fil
		int S = sc.nextInt();
		
		sc.close();

		String matriz[][] = new String[N][N];
		
		//Completa la matriz
		//Generamos vivos y muertos
		Random random = new Random(S);
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {

				int n = random.nextInt(1 - 0 + 1) + 0;
				if(n ==0) {
					matriz[x][y] = " ";
				}else {
					matriz[x][y] = "O";
				}
			}
		}

		// Imprime la matriz
		for (int n = 0; n < matriz.length; n++) {
			for (int s = 0; s < matriz[n].length; s++) {
				System.out.print(matriz[n][s]);
			}
			System.out.println("");
		}
	}

}
