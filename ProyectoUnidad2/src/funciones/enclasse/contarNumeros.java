package funciones.enclasse;

import java.util.Scanner;

public class contarNumeros {

	public static int countdigit(int num) {
		int digitCounter=0;
		
		while(num>0) {
			digitCounter++;
			num/=10;
		}
		return digitCounter;
	}
	
	public static int deleteNDigit(int num, int N) {

		int cifra,exponente=0, contPosicion=1,numRes=0;
		
		while (num>0) {
			
			if (contPosicion!=N) {
				
				cifra=num%10;
				numRes= numRes +  cifra* (int) Math.pow(10, exponente);
				exponente++;
				
				
			} 
			contPosicion++;	
			num=num/10;
			
		}
		
		return numRes;
	}	
		
	public static int replacedigit(int num, int digit,int newdigit) {
	
		int cifra,exponente=0, contPosicion=1,numRes=0;
		
		while (num>0) {
			
			if (contPosicion!=digit) {
				
				cifra=num%10;
			} 
			else {
				
				cifra=newdigit;
			} 
			numRes= numRes +  cifra* (int) Math.pow(10, exponente);
			exponente++;
			contPosicion++;	
			num=num/10;
			}
			return numRes;
		}
	
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num3= sc.nextInt();		
		System.out.println("tiene un total de " +countdigit(num1)+" cifras");
		
		int outcome= deleteNDigit(num1, num2);
		
	     System.out.println("the number after taking out the " + num2 + " position for "+  num1+ " is " + outcome);
	     outcome= replacedigit(num1, num2,num3);
	     System.out.println("the number after replacing out the " + num2 + " poaition with "+num3+" for "+  num1+ " is " + outcome);
	     
	     System.out.println("the number after taking out the " + num2 + " position for "+  num1+ " is " + outcome);
	}

}
