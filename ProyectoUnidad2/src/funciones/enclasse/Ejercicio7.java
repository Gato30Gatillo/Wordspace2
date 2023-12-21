package funciones.enclasse;

import java.util.Scanner;

public class Ejercicio7 {
	
	static double factorial(double numfactorial) {
		double resultadofactorial=1;
		for (double i=1;i<=numfactorial;i++) {
			resultadofactorial*=i;
		}
		
		return resultadofactorial;
}
	
	static double potencia(double base,double exponente) {
		return Math.pow(base, exponente);
	}
	
	static double nTermino(double x,double n) {
		return potencia(x,n)/ factorial(n);
	}
	
	static double funcionE (double x,double precision) {
		double resultado=0;
		
		for (double i=0;i<=precision;i++) {
		resultado=resultado+ nTermino(x,i); //(potencia(x,i)/factorial(i));	
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		double angulo,precision;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce el angulo");
		angulo= sc.nextDouble();		
		System.out.println("introduce la precision");
		precision= sc.nextDouble();
		
		System.out.println(funcionE(angulo,precision));
		System.out.println(funcionE(5,10));
		
		System.out.println(potencia(2,5));
		System.out.println(factorial(5));
		
		
	}
}
