package buclesfor;
import java.util.Scanner;
public class Ejercicio10Anidados {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int altura=0;
			System.out.println("introduce el numero de filas ");
			altura= sc.nextInt();
			for(int i=1;i<=altura;i++) {
				for(int j=i;j>=1;j--) {
					System.out.print(2*j-1);
				}
				System.out.print("\n");
			}
			
	}

}
