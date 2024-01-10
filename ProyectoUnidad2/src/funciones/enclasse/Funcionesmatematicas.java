package funciones.enclasse;

import java.util.Scanner;

public class Funcionesmatematicas {
	
	public static String reverted(int aux) {
		
		String inverted="";
		
		while (aux>0) {
		inverted=inverted+(aux%10);
		aux=aux/10;
	}
		return inverted;
		
	}
	public static String delete(int aux,int eliminar) {
		
		String delete="";
		int cont=1;
		while (aux>0) {
			if(eliminar!=cont){
				delete=(aux%10)+delete;
			}
			aux=aux/10;
			cont++;
	}
		return delete;
		
	}
	
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
	
	static double mcd (int a,int b) {
		
		int max;
		int min;
		int aux;
		max = a>b? a:b;
		min = a<b? a:b;
		while(b!=0) {
			aux=min;
			min= max%min;
			max=aux;
		}
		return max;
	}
	
	static String simplificar(int numerador,int denominador) {
		
		double divisor= mcd(numerador,denominador);
		String fraccion ="/";
		fraccion= numerador/divisor+fraccion+denominador/divisor;
		return fraccion;
	}
	
	static String nprimelist(int num1,int num2,int cantidad) {
		
		int contar=0;
		boolean primo=true ;
		String lista ="";
		for(int i=num1;i<=num2;i++){
			for(int j=2;j<i;j++) {
				if (i%j==0) {
					primo= false;
				}
			}
		if (primo==true&&contar!=cantidad) {
		lista= lista+i+",";
		contar++;
		}
		primo=true;
	}
		return lista;
	}
	
	static String rangedprimelist(int num1,int num2) {
		boolean primo=true ;
		String lista ="";
		for(int i=num1;i<=num2;i++){
			for(int j=2;j<i;j++) {
				if (i%j==0) {
					primo= false;
				}
			}
		if (primo==true) {
		lista= lista+i+",";
		}
		primo=true;
	}
		return lista;
	}
	
	static int RotarALaDerecha(int number) {
		
		int numdigits= countdigit(number);
		int digit=0;
		int result=0;
		
		digit = number%10;
		result= (int) (digit*Math.pow(10, numdigits-1));
		number=number/10;
		result=result+number;
		
		
		return result;
	}
	
	static int RotarNVecesALaDerecha(int number,int veces) {
		
		int numdigits= countdigit(number);
		int digit=0;
		int result=0;
		
		if(veces>numdigits) {
			veces=veces%numdigits;
		}
		
		for(int i=0;i<veces;i++) {
		digit = number%10;
		result= (int) (digit*Math.pow(10, numdigits-1));
		number=number/10;
		result=result+number;
		number=result;
		}
		
		
		return result;
	}
	
	static int RotarNVecesALaIzquierda(int number,int veces) {
		
		int numdigits= countdigit(number);
		int digit=0;
		int result=0;
		
		if(veces>numdigits) {
			veces=veces%numdigits;
		}
		
		for(int i=0;i<veces;i++) {
		digit = (int) (number/Math.pow(10, numdigits-1));
		result= (int) (digit);
		number=(int) (number%Math.pow(10, numdigits-1))*10;
		result=result+number;
		number=result;
		}
		
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		int num,aux=0,eliminar;
		String inverted="";
		String delete="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give me a number");
		num= sc.nextInt();
		System.out.println("give me the position of the number you wish to delete");
		eliminar= sc.nextInt();
		aux=num; 
		inverted=reverted(aux);
		System.out.println(num+" inverted is "+inverted);
		delete=delete(aux,eliminar);
		System.out.println(num+" without the position "+eliminar+" is "+delete);
		
	int num1,num2;
	System.out.println("give me a number");
	num1= sc.nextInt();
	System.out.println("give me a number");
	num2= sc.nextInt();
	System.out.println(RotarALaDerecha( num1));
	System.out.println(RotarNVecesALaDerecha( num1,num2));
	System.out.println(RotarNVecesALaIzquierda( num1,num2));
	System.out.println(nprimelist( 1,100,3));
	System.out.println(rangedprimelist( 1,89));


}
}