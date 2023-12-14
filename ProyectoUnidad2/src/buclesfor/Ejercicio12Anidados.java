package buclesfor;

public class Ejercicio12Anidados {

	public static void main(String[] args) {
		
			for(int i=1;i<=3;i++) {
				System.out.print("\nExterno: "+i);
				for(int j=1;j<=2;j++) {
					System.out.print("\t Interno: "+j);
				}
			}
			
	}

}
