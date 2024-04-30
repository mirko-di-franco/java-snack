package palindroma;

import java.util.Scanner;

public class CalcoloPalindroma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una parola");
		String strUtente = scanner.nextLine().toLowerCase();
		
		char[] arrStrUtente = strUtente.toCharArray();
		char[] arrReverseStrInput = new char[strUtente.length()];
		
		
		int i = arrStrUtente.length -1;
		int j = 0;
		
		while(j < arrStrUtente.length) {
			arrReverseStrInput[j] = arrStrUtente[i];
			i--;
			j++;
		}
		
		//converto l'array di caratteri in stringa e faccio il controllo tra le due stringhe
		boolean isPalindroma = String.valueOf(strUtente).equals(String.valueOf(arrReverseStrInput)) ? true : false;
		
		System.out.println(isPalindroma ? "La parola è palindroma" : "La parola non é palindroma");
		
		scanner.close();
		

	}

}
