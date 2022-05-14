import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Blog {
  protected ArrayList<Usuario> usuarios;
  protected ArrayList<Postagem> postagens;
  protected Usuario usuarioAtual;
  protected ArrayList<String> palavrasProibidas;
  private RegrasNegocio rN;

  public Blog(){
    this.usuarios = new ArrayList<Usuario>();
    this.postagens = new ArrayList<Postagem>();
    this.palavrasProibidas = new ArrayList<String>();
    this.rN = new RegrasNegocio();
  }
  
  private Retorno<ArrayList<Postagem>> buscaPostagens(Usuario user){ //busca postagens do usuario
    ArrayList<Postagem> postagensUser = new ArrayList<Postagem>();
    for(Postagem p: postagens){
      if(p.getAutor().getId()==user.getId()){
        postagensUser.add(p);
      }
    }
    return new Retorno<ArrayList<Postagem>>(true,"Consultado com sucesso!",postagensUser);
  }

  private Retorno<ArrayList<Postagem>> buscaPostagens(String chave){ //busca postagem por palavra chave
    if(rN.procurarPalavrasProibidas(chave)){
      return new Retorno<ArrayList<Postagem>>(false,"Palavra proibida!");
    }
    ArrayList<Postagem> postagensPalavraChave = new ArrayList<Postagem>();
    for(Postagem p: postagens){
      if(p.getConteudo().toLowerCase().contains(chave.toLowerCase())){
        postagensPalavraChave.add(p);
      }else{
        for(String s: p.getTags()){
          if(s.equalsIgnoreCase(chave)){
            postagensPalavraChave.add(p);
          }
        }
      }
    }
    return new Retorno<ArrayList<Postagem>>(true,"Consultado com sucesso!",postagensPalavraChave);
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
    this.usuarios.add(new Usuario(3, "Pedro", false));
    this.usuarios.add(new Usuario(4, "Otavio", false));
    this.usuarios.add(new Usuario(5, "Irving", true));
    this.usuarios.add(new Usuario(6, "Jos�", true));
    Postagem p1 = new Postagem(this.usuarios.get(0), new Date(), "Conteudo da postagem 1", null, null);
    this.postagens.add(p1);
    Postagem p2 = new Postagem(this.usuarios.get(3), new Date(), "Conteudo da postagem 2", null, null);
    this.postagens.add(p2);
    Postagem p3 = new Postagem(this.usuarios.get(2), new Date(), "Conteudo da postagem 3", null, null);
    this.postagens.add(p3);
    Postagem p4 = new Postagem(this.usuarios.get(5), new Date(), "Conteudo da postagem 4", null, null);
    this.postagens.add(p4);
    Postagem p5 = new Postagem(this.usuarios.get(5), new Date(), "Conteudo da postagem 5", null, null);
    this.postagens.add(p5);
    Postagem p6 = new Postagem(this.usuarios.get(4), new Date(), "Conteudo da postagem 6", null, null);
    this.postagens.add(p6);
    Postagem p7 = new Postagem(this.usuarios.get(1), new Date(), "Conteudo da postagem 7", null, null);
    this.postagens.add(p7);
    Postagem p8 = new Postagem(this.usuarios.get(3), new Date(), "Conteudo da postagem 8", null, null);
    this.postagens.add(p8);
    Postagem p9 = new Postagem(this.usuarios.get(4), new Date(), "Conteudo da postagem 9", null, null);
    this.postagens.add(p9);
    Postagem p10 = new Postagem(this.usuarios.get(5), new Date(), "Conteudo da postagem 10", null, null);
    this.postagens.add(p10);
    Comentario c1 = new Comentario(this.usuarios.get(2),"Comentario 1", new Date());
    Comentario c2 = new Comentario(this.usuarios.get(3),"Comentario 2", new Date());
    Comentario c3 = new Comentario(this.usuarios.get(2),"Comentario 3", new Date());
    Comentario c4 = new Comentario(this.usuarios.get(3),"Comentario 4", new Date());
    Comentario c5 = new Comentario(this.usuarios.get(2),"Comentario 5", new Date());
    Comentario c6 = new Comentario(this.usuarios.get(3),"Comentario 6", new Date());
    Comentario c7 = new Comentario(this.usuarios.get(2),"Comentario 7", new Date());
    Comentario c8 = new Comentario(this.usuarios.get(3),"Comentario 8", new Date());
    Comentario c9 = new Comentario(this.usuarios.get(2),"Comentario 9", new Date());
    Comentario c10 = new Comentario(this.usuarios.get(3),"Comentario 10", new Date());
    Comentario c11 = new Comentario(this.usuarios.get(3),"Comentario 11", new Date());
    Comentario c12 = new Comentario(this.usuarios.get(3),"Comentario 12", new Date());
    Comentario c13 = new Comentario(this.usuarios.get(3),"Comentario 13", new Date());
    Comentario c14 = new Comentario(this.usuarios.get(3),"Comentario 14", new Date());
    c1.addlike();
    c1.addlike();
    p1.addComentario(c1);
    p2.addComentario(c2);
    p3.addComentario(c3);
    p4.addComentario(c4);
    p5.addComentario(c5);
    p6.addComentario(c6);
    p7.addComentario(c7);
    p8.addComentario(c8);
    p9.addComentario(c9);
    p10.addComentario(c10);
    p5.addComentario(c11);
    p7.addComentario(c12);
    p3.addComentario(c13);
    p8.addComentario(c14);
    
  
    
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
