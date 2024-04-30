package sommaDispari;

public class SommaDispari {

	public static void main(String[] args) {
		
		 int[] numeri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		 int somma = 0;
		 
		 for(int i=0; i < numeri.length; i++) {
			 if((i % 2)==0) {
				 somma += numeri[i];
			 }
		 }
		 
		 System.out.println("La somma dei numeri che sono in posizione dispari è: "+somma);

	}

}
