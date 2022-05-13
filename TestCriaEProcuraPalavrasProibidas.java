
import java.util.ArrayList;
import java.util.Scanner;

public class TestCriaEProcuraPalavrasProibidas {
	
	public static void main(String[] args) {
		ArrayList<String> palavrasProibidas = new ArrayList<String>();
		CriaPalavrasProibidas cria = new CriaPalavrasProibidas();
		cria.criacaoPalavrasProividas(palavrasProibidas);
		
		System.out.println("Informe qual palavra voce deseja mudar ou digite \"X\" para cancelar: ");
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		if(!test.toUpperCase().equals("X")) {
			CriaPalavrasProibidas modifica = new CriaPalavrasProibidas();
			modifica.modificaPalavraProibidaByElement(test, palavrasProibidas);
		}
		
		String str = "Estou procurando a palavra \"merda\", ajude por favor";
		EncontraPalavrasProibidas busca = new EncontraPalavrasProibidas();
		boolean resultado = busca.procurarPalavrasProibidas(str, palavrasProibidas);
		System.out.println(resultado);
		sc.close();
	}

}