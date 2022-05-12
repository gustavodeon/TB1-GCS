import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Blog {
  ArrayList<Usuario>  usuarios;
  ArrayList<Postagem> postagens;
  Usuario             usuarioAtual;

  public Blog(){
    this.usuarios = new ArrayList<Usuario>();
    this.postagens = new ArrayList<Postagem>();
  }

  public void inicalizar(){
    Scanner sc = new Scanner(System.in);
    int opcao;
    System.out.println("Blog.OS");

    this.mockData();
    this.loginUsuario();
    this.handleOpcoes();

  }

  private void mockData() {
    this.usuarios.add(new Usuario(1, "josé", true));
    this.usuarios.add(new Usuario(2, "Felipe", false));
    this.postagens.add(new Postagem(this.usuarios.get(0), new Date(), "teste", null, null));
  }

  private void loginUsuario() {
    Scanner sc = new Scanner(System.in);
    int opcao;
    while (true) {
      System.out.println("Login: insira seu usuário");
      this.listarUsuarios();
      opcao = sc.nextInt();

      if (!this.selecionarUsuario(opcao)) {
        System.out.println("usuário inválido, tente novamente");
      } else {
        return;
      }
    }
  }

  private boolean selecionarUsuario(int opcao) {
    for (Usuario usuario: this.usuarios){
      if(usuario.getId() == opcao){
        this.usuarioAtual = usuario;
        return true;
      }
    }
    return false;
  }

  private void listarUsuarios() {
    String tipo;
    for (Usuario usuario: this.usuarios){
      tipo = usuario.isAdministrador() ? "Administrador" : "Funcionário";
      System.out.println(usuario.getId() + " | " + tipo + " | " + usuario.getNome());
    }
  }

  private void handleOpcoes() {
    Scanner sc = new Scanner(System.in);
    int opcao;

    while(true) {
      System.out.println("1: Criar nova postagem");
      System.out.println("2: Listar todas postagens");
      System.out.println("3: Excluir postagem");
      System.out.println("4: Criar novo comentário");
      System.out.println("5: Excluir comentário");

      if (usuarioAtual.isAdministrador()) {
        System.out.println("6: Criar nova palavra proibida");
        System.out.println("7: Excluir palavra proibida");
        System.out.println("8: Acessar painel administrador");
      }

      System.out.println("9: Pesquisa por tag | palavra-chave");
      System.out.println("10: Trocar usuário");
      opcao = sc.nextInt();

      switch (opcao) {

        case 1:
          if (!addPostagem())
            System.out.println("Algo deu errado");
          break;
          
        case 8:
        	if(usuarioAtual.isAdministrador()) {
        		PainelAdmin p = new PainelAdmin(usuarios, postagens);
        		p.painel();
        	}else
        		System.out.println("Voce precisa ser admin para essa funcao!!");
        	break;
        case 10:
        	loginUsuario();
        	break;
        case 0:
          System.exit(0);
      }
    }
  }

  private boolean addUsuario(){
    //adiciona pessoa
    return false;
  }

  private boolean addPostagem(){
    Scanner sc = new Scanner(System.in);
    String conteudo, link = null;
    ArrayList<String> tags = new ArrayList<>();
    int opcao;

    //conteúdo
    System.out.println("Escreva o conteúdo");
    conteudo = sc.nextLine();

    //tags
    System.out.println("Gostaria de adicionar tags?");
    System.out.println("1: sim | 0: não");
    opcao = sc.nextInt();
    if(opcao == 1)
      tags = this.collectTags();

    //link
    System.out.println("Gostaria de adicionar link?");
    System.out.println("1: sim | 0: não");
    opcao = sc.nextInt();
    sc.nextLine();  // Consumindo a sobra do scanner
    if(opcao == 1){
      System.out.println("Insira o link");
      link = sc.nextLine();
      if(!link.startsWith("http://") && !link.startsWith("https://")){
        System.out.println("Formatação incorreta");
        return false;
      }
    }
    
    this.postagens.add(new Postagem(this.usuarioAtual, new Date(), conteudo, tags, link));
    this.usuarioAtual.addPostagem();
    return true;
  }

  private ArrayList<String> collectTags() {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> tags = new ArrayList<>();
    int opcao;
    System.out.println("insira a tag");
    tags.add(sc.nextLine());
    while(true){
      System.out.println("quer adicionar mais tags");
      System.out.println("1: sim | 0: não");
      opcao = sc.nextInt();
      sc.nextLine();  // Consumindo a sobra do scanner
      if(opcao == 1){
        System.out.println("Insira a tag:");
        tags.add(sc.nextLine());
      }
      else{
        return tags;
      }
    }
  }

  private boolean removePostagem(int posicao) {
    //remove postagem
	this.usuarioAtual.removePostagem();//arrumar posicao conforme a logica  
    return false;
  }

}
