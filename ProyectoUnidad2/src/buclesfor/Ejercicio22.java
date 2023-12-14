package buclesfor;
import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		
		String tree="";
		int height=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the tree height");
		height=sc.nextInt();
		
		for(int i=1; i<=height;i++) {
			
			int cont=i;
			for(int j=1;j<=i;j++) {
				
				if(cont%2!=0) {
				tree=tree+1;
				}
				
				if(cont%2==0) {
					tree=tree+0;
				}
				cont++;
			}
			tree=tree+"\n";
		}
		System.out.print(tree);
	}

}
