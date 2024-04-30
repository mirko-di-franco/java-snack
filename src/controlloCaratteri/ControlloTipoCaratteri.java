package controlloCaratteri;

import java.util.Scanner;

public class ControlloTipoCaratteri {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String inputUtente = null;
		
		do {
			System.out.println("Inserisci una stringa contentente: caratteri alfabetici, numeri e simboli non alfanumerici");
			System.err.println("Se vuoi terminare inserisci lo 0");
			inputUtente = scanner.nextLine();
		
		
		
		char[] strToChar = inputUtente.toCharArray();

		int contatoreLettere = 0;
		int contatoreNumeri = 0;
		int contatoreSimboli = 0;
		
		if(!inputUtente.equals("0")) {
		for(int i=0; i < inputUtente.length(); i++) {
			if(Character.isLetter(strToChar[i])) {
				contatoreLettere++;
			}else if(Character.isDigit(strToChar[i])) {
				contatoreNumeri++;
			}else {
				contatoreSimboli++;
			}
		}
		
		System.out.println("Ci sono: "+ "\n" +contatoreLettere+" lettere \n"+contatoreNumeri+" numeri \n"+contatoreSimboli+" simboli");
		
		}
		
	}while(!inputUtente.equals("0"));
		
		System.out.println("Fine");
		scanner.close();
  }
}
