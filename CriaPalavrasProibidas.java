package entidade;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CriaPalavrasProibidas {
	
	
	public void criacaoPalavrasProividas(ArrayList<String> proibidas) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Informe a palavra proibida ou digite \"X\" para cancelar: ");
			String strProibida = sc.nextLine();
			
			if(strProibida.toUpperCase().equals("X")) break;
			
			proibidas.add(strProibida);
		}
		sc.close();
	}
}
