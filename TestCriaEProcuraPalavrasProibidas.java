package aplicacao;

import java.util.ArrayList;

import entidade.CriaPalavrasProibidas;
import entidade.EncontraPalavrasProibidas;

public class TestCriaEProcuraPalavrasProibidas {
	
	public static void main(String[] args) {
		ArrayList<String> palavrasProibidas = new ArrayList<String>();
		CriaPalavrasProibidas cria = new CriaPalavrasProibidas();
		cria.criacaoPalavrasProividas(palavrasProibidas);
		
		String str = "Estou procurando a palavra \"merda\", ajude por favor";
		EncontraPalavrasProibidas busca = new EncontraPalavrasProibidas();
		boolean resultado = busca.procurarPalavrasProibidas(str, palavrasProibidas);
		System.out.println(resultado);
	}

}
