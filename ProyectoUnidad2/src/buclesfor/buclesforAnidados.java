package buclesfor;

public class buclesforAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int result = 1;
			for(int i=1;i<=3;i++) {
				System.out.println("\n "+i+" "+ " por cada vez que se ejecute el bucle exterior");
				System.out.println("se ejecuta cuatro el interior");
				System.out.println("numero de entrada para calcular la potencia a la cuarta"+i+ "\n");
				result=1;
				for(int j=1;j<=4;j++) {
					result*=i;
					System.out.println(j+ " " + " interación del bucle interno");
				}
			}
			
	}

}
