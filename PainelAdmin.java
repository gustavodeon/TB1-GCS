import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class PainelAdmin {
	private ArrayList<Usuario>  usuarios;
    private ArrayList<Postagem> postagens;
	
    public PainelAdmin(ArrayList<Usuario> usuarios, ArrayList<Postagem> postagens) {
    	this.usuarios = usuarios;
		this.postagens = postagens;
    }
    
	public int totalPost(){
		
		return postagens.size();
	}
	
	public int totalComentarios() {
	
		int contComentarios = 0;
		for (Postagem p : postagens) {
			contComentarios += p.getTotalComentarios();
		}
				
		return contComentarios;
	}
	
	public int totalUsuarios() {
	
		return usuarios.size();
	}
	
	
	public void opcao1() {
		
		System.out.println("Total de post: " + this.totalPost());
		System.out.println("Total de Comentarios: "+ this.totalComentarios());
		System.out.println("Total de Usuarios: "+ this.totalUsuarios());
		System.out.println();
		
	}
	
	
	public void opcao2() {
		
		
		ArrayList<Usuario> tempList = usuarios;
		
		Collections.sort(tempList, Comparator.comparing(Usuario::getTotalPostagens));
		
		
		
		System.out.println("Top 5 com mais postagens: ");
		for (int i = 0; i < 5 && i < tempList.size(); i++) {
			System.out.println(i+1 +" - "+ tempList.get(i).getNome() + " - " + tempList.get(i).getTotalPostagens());
		}
		System.out.println();
	}
	
	public void opcao3() {
		
		ArrayList<Usuario> tempList = usuarios;
		
		Collections.sort(tempList, Comparator.comparing(Usuario::getTotalComentarios));
		
		
		System.out.println("Top 10 com mais comentarios: ");
		
		for (int i = 0; i < 10 && i < tempList.size(); i++) {
			System.out.println(i+1 +" - "+ tempList.get(i).getNome()+ " - "+ tempList.get(i).getTotalComentarios());
		}
		System.out.println();
	}
	
	
	public void opcao4() {
		
		ArrayList<Postagem> tempList = postagens;
		
		Collections.sort(tempList, Comparator.comparing(Postagem::getTotalComentarios));
		
		
		System.out.println("Top 5 postagens mais comentadas: ");
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+1 +" - "+ tempList.get(i).getConteudo());
		}
		
		System.out.println();
	}
	
	
	public void painel() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Painel Do Administrador: ");
		System.out.println("1 - Listar Total de posts, total de comentarios, total de usuarios");
		System.out.println("2 - Ranking dos top 5 usuarios com mais postagens");
		System.out.println("3 - Ranking dos top 10 usuarios com mais comentários");
		System.out.println("4 - Ranking das top 5 postagens mais comentadas");
		System.out.println();
		System.out.println("Digite a opção desejada:");
		
		int op = sc.nextInt();
		
		if(op == 1)
			opcao1();
		else if(op == 2)
			opcao2();
		else if (op == 3)
			opcao3();
		else if(op == 4)
			opcao4();
		else {
			System.out.println("Digite uma opção valida");
			System.out.println();
			painel();
		}
	}	
}
