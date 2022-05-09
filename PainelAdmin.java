import java.util.Scanner;

public class PainelAdmin {
	
	public static int totalPost(){
		
		//logica pra pegar total de post
		return 0;
	}
	
	public static int totalComentarios() {
	
		//logica pra pegar total de comentarios
		return 0;
	}
	
	public static int totalUsuarios() {
		
		//Logica pra pegar total de usuarios
		return 0;
	}
	
	
	public static void opcao1() {
		
		System.out.println("Total de post: " + totalPost());
		System.out.println("Total de Comentarios: "+ totalComentarios());
		System.out.println("Total de Usuarios: "+ totalUsuarios());
		System.out.println();
		
	}
	
	
	public static void opcao2() {
		
		//logica pra pegar top 5 users com mais postagens
		
		String[] top5Ex = {"Felipe","João", "Pedro","Afonso", "José"};
		System.out.println("Top 5 com mais postagens: ");
		for (int i = 0; i < top5Ex.length; i++) {
			System.out.println(i+1 +" - "+ top5Ex[i]);
		}
		System.out.println();
	}
	
	public static void opcao3() {
		
		//logica pra pegar top 10 users com mais Comentarios
		
		String[] top5Ex = {"Felipe", "João", "Pedro", "Afonso", "José", "Bruno", "Ana", "Livia", "Carol","Lucas"};
		System.out.println("Top 10 com mais comentarios: ");
		
		for (int i = 0; i < top5Ex.length; i++) {
			System.out.println(i+1 +" - "+ top5Ex[i]);
		}
		System.out.println();
	}
	
	
	public static void opcao4() {
		
		//logica pra pegar top 5 postagens com mais comentarios
		
		String[] top5Ex = {"Agro é pop", "COVID", "BITCOIN", "BBB","E-Sports"};
		System.out.println("Top 5 postagens mais comentadas: ");
		
		for (int i = 0; i < top5Ex.length; i++) {
			System.out.println(i+1 +" - "+ top5Ex[i]);
		}
		System.out.println();
	}
	
	
	public static void painel() {
		
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
	
	
	public static void main(String[] args) {
		//teste
		
		while(true) {
			painel();
		}
	}
	
	
	
	
}
