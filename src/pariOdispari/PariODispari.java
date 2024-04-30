package pariOdispari;

import java.util.Scanner;

public class PariODispari {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		
		int numeroUtente = scanner.nextInt();
		
		if((numeroUtente % 2)==0) {
			System.out.println("Il numero è pari: "+numeroUtente);
		}else {
			System.out.println("Il numero inserito era disparo, verrà aggiunto un +1: "+(numeroUtente+1));
		}
		
		scanner.close();

	}

}
