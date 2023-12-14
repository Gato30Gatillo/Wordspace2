package buclesfor;
import java.util.Scanner;
public class ejercicio14Arbol {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int altura=0;
			int cont=1;
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
				for(int j=2;j<=i+1;j++) {
					tree=tree+(cont+" ");
					cont++;
				}
				tree=tree+("\n");
			}
			System.out.print(tree);
	}
}
