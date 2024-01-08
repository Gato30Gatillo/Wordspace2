package funciones.enclasse;
import java.util.Scanner;
public class ejercicio8 {

	static double distancia(double x1, double y1,double x2,double y2) {
		return  Math.sqrt(Math.pow(x2-x1, 2)+(Math.pow(y2-y1, 2)));
		
	}
	
	public static void main(String[] args) {
		Double x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame x1");
		x1= sc.nextDouble();
		
		System.out.println( "Dame y1");
		y1= sc.nextDouble();
		
		System.out.println( "Dame x2");
		x2= sc.nextDouble();
		
		System.out.println("Dame y2");
		y2= sc.nextDouble();
		
		System.out.println("La distancia entre ("+x1+","+y1+") y el punto ("+x2+","+y2+") es " + distancia(x1,y1,x2,y2));
		
	}
	
}
