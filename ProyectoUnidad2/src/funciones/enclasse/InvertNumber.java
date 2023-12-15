package funciones.enclasse;

import java.util.Scanner;

public class InvertNumber {
	
	public static String reverted(int aux) {
		String inverted="";
		while (aux>0) {
		inverted=inverted+(aux%10);
		aux=aux/10;
	}
		return inverted;
		
	}
	
	
	public static void main(String[] args) {
		// first i would ask for a number and create a string to get the number in inverse orden them
		//we also should create a auxiliary and them do a bucle in witch we get the last number and put it in the string
		//the bucle stop when the number only has units
		
		int num,aux=0;
		String inverted="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give me a number");
		num= sc.nextInt();
		aux=num; 
		inverted=reverted(aux);
		
		System.out.print(num+" inverted is "+inverted);
		
	}


}
