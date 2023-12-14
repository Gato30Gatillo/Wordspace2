package buclesfor;
import java.util.Scanner;
public class ArbolNavidad {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int altura=0;
			System.out.println("introduce el numero de filas ");
			altura= sc.nextInt();
			for(int i=1;i<=altura;i++) {
				System.out.print("\t");
				if(i!=altura) {
					for(int z=i;z!=altura;z++){
					System.out.print(" ");
					}
				}
				for(int j=1;j<=i*2-1;j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			for(int i=altura-1;i>=1;i--) {
				System.out.print("\t");
				if(i!=1) {
					for(int z=altura;z!=i;z--){
					System.out.print(" ");
					}
				}
					if(i==1) {
						for(int z=i;z!=altura;z++){
						System.out.print(" ");
						}
					}
				for(int j=1;j<=i*2-1;j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
	}
}

