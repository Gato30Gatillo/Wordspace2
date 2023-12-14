package buclesfor;
import java.util.Scanner;
public class arbolNavidadCadenas {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int altura=0;
			String tree="";
			System.out.println("introduce el numero de filas ");
			altura= sc.nextInt();
			for(int i=1;i<=altura;i++) {
				tree=tree+("\t");
				if(i!=altura) {
					for(int z=i;z!=altura;z++){
					tree=tree+(" ");
					}
				}
				for(int j=1;j<=i*2-1;j++) {
					tree=tree+("*");
				}
				tree=tree+("\n");
			}
			
			for(int i=altura-1;i>=1;i--) {
				tree=tree+("\t");
				if(i!=1) {
					for(int z=altura;z!=i;z--){
					tree=tree+(" ");
					}
				}
					if(i==1) {
						for(int z=i;z!=altura;z++){
						tree=tree+(" ");
						}
					}
				for(int j=1;j<=i*2-1;j++) {
					tree=tree+("*");
				}
				tree=tree+("\n");
			}
			System.out.print(tree);
	}
}
