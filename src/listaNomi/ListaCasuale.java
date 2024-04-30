package listaNomi;

import java.util.Random;

public class ListaCasuale {

	public static void main(String[] args) {
		
		 String[] nomi = {"Luca", "Sofia", "Matteo", "Giulia", "Andrea", "Martina", "Marco", "Chiara", "Alessandro", "Francesca"};
		 
		 String[] cognomi = {"Rossi", "Bianchi", "Esposito", "Ricci", "Moretti", "Romano", "Ferrari", "Russo", "Conti", "De Luca"};
		 
		 Random random = new Random();
		 
		 
		 System.out.println("Lista invitati:");
		 
		 for(int i =1; i <= 30; i++) {
			 int indexNome = random.nextInt(nomi.length);
			 int indexCognome = random.nextInt(cognomi.length);
			 
			 System.out.println(nomi[indexNome] +" "+ cognomi[indexCognome]);
			 
		 }

	}

}
