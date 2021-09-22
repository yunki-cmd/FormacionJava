package Eje12;



public class Ejecuta {

	public static void main(String[] args) {
		
		for (int i = 3; i <= 100; i+=2) {
			for (int j = 1, aux = 0; j <= i; j++) {
				if(i % j == 0) {
					aux++;
				}
				if(aux > 2) {
					j = i;
				}
				if(j==i) {
					if(aux < 3) {
						System.out.println("primo: "+ i);
					}
				}
				
			}
		}
		
	}

}
