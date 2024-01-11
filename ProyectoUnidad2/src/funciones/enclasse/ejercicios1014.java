package funciones.enclasse;
import java.util.Scanner;

public class ejercicios1014 {

	public static int countdigit(int num) {
		
		int digitCounter=0;
		
		while(num>0) {
			digitCounter++;
			num/=10;
		}
		return digitCounter;
	}
	
	static int quitarpordetras(int num,int n){
		
		return (int) (num/Math.pow(10, n));
	}
	static int quitarpordelante(int num,int n){
		int numdigits = countdigit(num);
		return (int) (num%Math.pow(10, (numdigits-n)));
	}
	
	static int pegarpordetras(int num,int n){
		int numdigits = countdigit(n);
		return (int) (num*Math.pow(10,numdigits)+n);
	}
	
	static int pegarpordelante(int num,int n){
		int numdigits = countdigit(num);
		return (int) (num+n*Math.pow(10, (numdigits)));
	}
	
	static int trozodenumero(int num, int inicio,int fin){
		int numdigits = countdigit(num);
		int resultado=0;
		resultado=(int) (num/Math.pow(10, inicio));
		resultado=(int) (resultado+num%Math.pow(10, fin));
		return resultado;
	}
	static int calcularsegundos(int horas, int minutos,int segundos){
		minutos=minutos+(horas*60);
		segundos=segundos+(minutos*60);
		return segundos;
	}
	static String calcularhoras(int segundos){
		int minutos = segundos/60;
		int horas=minutos/60;
		segundos=segundos%60;
		minutos=minutos%60;
		return horas+" horas, "+minutos+" minutos, "+segundos+" segundos.";
	}
	
	public static void main(String[] args) {
		int num,n,num1;
		Scanner sc = new Scanner(System.in);

		System.out.println("give me a number");
		num= sc.nextInt();
		System.out.println("give me a number");
		n= sc.nextInt();
		System.out.println("give me a number");
		num1= sc.nextInt();
		System.out.println(quitarpordetras(num,n));
		System.out.println(quitarpordelante(num,n));
		System.out.println(pegarpordetras(num,n));
		System.out.println(pegarpordelante(num,n));
		System.out.println(trozodenumero(num,n,num1));
		System.out.println(calcularsegundos(34,51,23)+" segundos");
		System.out.println(calcularhoras(714960));
	}

}
