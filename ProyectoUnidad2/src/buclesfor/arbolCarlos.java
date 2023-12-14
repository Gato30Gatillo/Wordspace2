package buclesfor;
import java.util.Scanner;

public class arbolCarlos {

	public static void main(String[] args) {
		
		int n=0;
		int cont=1;
		String tree="";
		int height=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the tree height");
		height=sc.nextInt();
		
		for(int i=1; i<=height;i++) {
			for(int j=1;j<=i;j++) {
				tree=tree+i+" ";
				cont++;
			}
			tree=tree+"\n";
		}
		System.out.print(tree);
	}

}
