package ejerciciosprofe;

import java.util.Scanner;

public class EjercicioProfesorWhile {
	public static void main(String[] args) {
		int n,num,contador=1,cifra;
		Scanner sc = new Scanner(System.in);
		System.out.println("selecciona el numero  ");
		n= sc.nextInt();
		num=n;
		while(n>=10) {
			n=n/10;
			contador++;
		}
		n=num;
		System.out.print("el numero "+num+" tiene "+contador+" cifras:");
		for(int i=contador;i>0;i--) {
		cifra=(int) (n/Math.pow(10,i-1));
		if (cifra>=10) {
			cifra=cifra%10;
		}
		if(i>1){
		System.out.print(cifra+ ",");
		}
		else{
			System.out.print(cifra);
			}
		}
	}

}
