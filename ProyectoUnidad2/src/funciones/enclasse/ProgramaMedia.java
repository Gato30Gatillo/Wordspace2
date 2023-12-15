package funciones.enclasse;


import java.util.Scanner;

public class ProgramaMedia {
	
							//	parámetros formales
	public static double media( int x , int y ) {
	
	double calculo;
	
	calculo = (double) (x + y)  / 2;    
	return calculo;
	//También se puede poner Return  ((x + y)  / 2)
	}

	public static double funcionPow (int base, int exponente) {
		double resultado =1;
		
		for (int i=1;i<=exponente;i++) {
			resultado=resultado*base;
		}
		return resultado;
	}
	
	public static long factorial(int n) {
		long resultadof=1;
		for (int i=1;i<=n;i++) {
			resultadof=resultadof*i;
		}
		return resultadof;
	}
	
	private static int sumaNumerosEnRango(int min, int max) {
		
		int truemin,truemax;
		if (max>min) {
			truemax=max;
			truemin=min;
		}
		else {
			truemax=min;
			truemin=max;
		}
		int resultadosuma=0;
		
		for (int i=truemin+1;i<truemax;i++) {
				resultadosuma=resultadosuma+i;
			
		}
		
		return resultadosuma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,fac;
		double result,resultado,resultadof,resultadosuma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el primer Numero");
		num1= sc.nextInt();
		
		System.out.println( "Dame el segundo Numero");
		num2= sc.nextInt();
		
		System.out.println( "Dame el factorial");
		fac= sc.nextInt();
		
		result=media(num1,num2);
		resultado=funcionPow(num1,num2);
		resultadof=factorial(fac);
		resultadosuma=sumaNumerosEnRango(num1,num2);
	 //parámetros ACTUALES O REALES n1 y n2

		System.out.println( "La media es:" + result) ;
		System.out.println( "La potencia es:" + resultado) ;
		System.out.println( "El factorial es:" + resultadof) ;
		System.out.println( "La suma de los numeros en su rango es:" + resultadosuma) ;

		



	}

}
