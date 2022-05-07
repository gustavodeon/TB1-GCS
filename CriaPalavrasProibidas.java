package entidade;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CriaPalavrasProibidas {
	Scanner sc = new Scanner(System.in);
	
	public void criacaoPalavrasProividas (ArrayList<String> proibidas) {
		Locale.setDefault(Locale.US);
				
		while(true) {
			System.out.println("Informe a palavra proibida ou digite \"X\" para cancelar: ");
			String strProibida = sc.nextLine();
			
			if(strProibida.toUpperCase().equals("X")) break;
			
			proibidas.add(strProibida);
		}
	}
	
	public void modificaPalavraProibidaByElement(String antigaPalavra, ArrayList<String> proibidas) {
		
		for(int i = 0; i < proibidas.size(); i++) {
			if(antigaPalavra.toUpperCase().equals(proibidas.get(i).toUpperCase())) {
				System.out.println("Informe a nova palavra ou digite \"X\" para cancelar: ");
				String novaProibida = sc.nextLine();
				
				if(novaProibida.toUpperCase().equals("X")) break;
				
				proibidas.set(i, novaProibida);
				System.out.println("Palavra modificada com sucesso");
				break;
			}
		}
	}
}