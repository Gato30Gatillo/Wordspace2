package funciones.enclasse;
import java.util.Scanner;
public class ejerciciosRecursion {

	public static int sumaNprimerosNumeros(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return n+sumaNprimerosNumeros(n-1);
		}
	}
	
	public static String imprimirNprimerosNumeros(int n) {
		if(n==1) {
			return "1";
		}
		else {
			return n+","+imprimirNprimerosNumeros(n-1);
		}
	}
	
	public static String imprimirDesdeNprimerosNumeros(int n) {
		if(n==1) {
			return "1";
		}
		else {
			return imprimirDesdeNprimerosNumeros(n-1)+","+n;
		}
	}
	
	static void printfun(int test) {
		
		if(test<1) {
			return;
		}
		else {
			System.out.printf("%d ", test);
			
			printfun(test-1);
			
			System.out.printf("%d ", test);
			return;
			
		}
	}
	
	public static int cantidaddedigitos(int n) {
		if(n!=0) {
			return 1+cantidaddedigitos(n/10);
			
		}
		else {
			return 0;
		}
	}
	
	static void ImprimeInvertido(int test) {
		
		if(test==0) {
			return;
		}
		else {
			System.out.print(test%10);
			ImprimeInvertido(test/10);
			return;
			
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		System.out.println("dame un numero");
		n=sc.nextInt();
		System.out.println("La suma de todos los numeros hasta "+n+" es "+sumaNprimerosNumeros(n));
		System.out.println("la lista de numeros desde "+n+" hasta 1 es "+imprimirNprimerosNumeros(n));
		System.out.println("La lista de numeros desde 1 hasta "+n+" es "+imprimirDesdeNprimerosNumeros(n));
		System.out.println("Los digitos de "+n+" son "+cantidaddedigitos(n));
		ImprimeInvertido(n);

	}
}
