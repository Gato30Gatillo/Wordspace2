package ejerciciosprofe;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,horas,minutos,segundos,horaActual,minutoActual,segundoActual;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una hora");
		System.out.println("horas:");
		horaActual=sc.nextInt();
		System.out.println("Minutos");
		minutoActual=sc.nextInt();
		System.out.println("Segundos: ");
		segundoActual=sc.nextInt();
		System.out.println("Cuantos segundos quieres incrementar");
		a=sc.nextInt();
		segundos = (segundoActual+a)%60;
		a=a/60;
		if(segundos>60) {
			a=a+segundos/60;
			segundos=segundos%60;
		}
		minutos= minutoActual+a%60;
		if(minutos>60) {
			a=a+minutos/60;
			minutos=minutos%60;
		}
		a=a/60;
		horas=horaActual+a;
		if(horas>24) {
			horas=horas%24;
		}
		System.out.println(horas+"horas "+minutos+" minutos "+segundos+" segundos ");
	}
}