package funciones.enclasse;

import java.util.Scanner;

public class FuncionesEjercicio1 {
	
	
	static void texto(String nombre) {
		System.out.println("hola "+nombre+" ¿Como estas?");
	}	
	
	static boolean verdad(int num1,int num2) {
		boolean multiplo=true;
			if(num1%num2!=0){
				multiplo=false;
			}
			return multiplo;	
	}
	
	static double temperatura(double tempmax,double tempmin) {
		
			return (tempmax+tempmin)/2;
	}
	
	static double funcion(int x) {
		return Math.pow(x, 3)+2*x-3;
	}
	
	static void usuario(String nombre,String contraseña) {
		if(nombre.equals("usuario1")&&contraseña.equals("asdasd")) {
			System.out.println("verdadero");
		}
	}
	
	public static void main(String[] args) {
		
		String nombre="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame un nombre");
		nombre= sc.next();

		texto(nombre);
		
		int num1,num2;
		boolean multiplo;
		
		System.out.println("dame un numero");
		num1= sc.nextInt();
		System.out.println("dame otro numero");
		num2= sc.nextInt();
		/*
		multiplo=verdad(num1, num2);
		System.out.println("¿Es el primer numero multiplo del segundo? "+multiplo);
		*/
		if(verdad(num1, num2)) {
			System.out.println("El primer numero es multiplo del segundo");
		}
		else {
			System.out.println("El primer numero no es multiplo del segundo");
		}
		
		int bucletemperatura;
		double tempmax,tempmin;
		
		System.out.println("cuantos dias quieres introducir");
		bucletemperatura= sc.nextInt();
		
		for(int i=0;i!=bucletemperatura;i++) {
		
		System.out.println("cual es la temperatura maxima del dia "+i);
		tempmax= sc.nextDouble();
		System.out.println("cual es la temperatura minima del dia "+i);
		tempmin= sc.nextDouble();
		
		System.out.println("la temperatura media del dia "+i+" es de "+temperatura(tempmax,tempmin) );
		}
		
		int x;
		System.out.println("Dame un valor para x ");
		x= sc.nextInt();
		
		System.out.println("la funcion f(x)=x^3+2x-3 es igual a "+funcion(x));
		
	
	String usuario="",contraseña="";
	int cont=0;
	while(!usuario.equals("usuario1")&&!contraseña.equals("asdasd")) {
	System.out.println("introduce un usuario");
	usuario= sc.next();
	System.out.println("introuce una contraseña");
	contraseña= sc.next();
	cont++;
	usuario(usuario,contraseña);
	}
	System.out.println("te ha llevado "+cont+" intentos");
	//6.2
	
	cont=0;
	System.out.println("tienes 3 intentos");

	while((!usuario.equals("usuario1")&&!contraseña.equals("asdasd"))&& cont<=3) {
		System.out.println("introduce un usuario");
		usuario= sc.next();
		System.out.println("introuce una contraseña");
		contraseña= sc.next();
		cont++;
		usuario(usuario,contraseña);
		}
		System.out.println("te ha llevado "+cont+" intentos");
	}
}
