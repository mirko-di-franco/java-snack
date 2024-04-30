package stringaToIntero;

public class StringaToIntero {

	public static void main(String[] args) {
		
		String strNumero = "54";
		
		int numero = 0;
		
		for(int i=0; i <strNumero.length(); i++) {
			char carattereAsci = strNumero.charAt(i);
			
			if(carattereAsci >= '0' && carattereAsci <= '9') {
				int valoreCarattere = carattereAsci - '0';
				numero = numero * 10 + valoreCarattere ; 
			}else {
				System.out.println("La stringa non contiene solo numeri");
			}
		}
		
		System.out.println(numero);
		
	}

}
