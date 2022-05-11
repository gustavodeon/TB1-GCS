import java.util.ArrayList;

public class Blog {
  ArrayList<Usuario> usuarios;
  ArrayList<Postagem> postagens;

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
    for (Usuario usuario: this.usuarios){
      System.out.println(usuario.getId() + " | " + usuario.isAdministrador() ? "Administrador | " : "Funcionário | " + usuario.getNome());
    }
  }

  private void handleOpcoes() {
    Scanner sc = new Scanner(System.in);
    int opcao;

    System.out.println("1: Criar nova postagem");
    System.out.println("2: Listar todas postagens");
    System.out.println("3: Excluir postagem");
    System.out.println("4: Criar novo comentário");
    System.out.println("5: Excluir comentário");

    if(usuarioAtual.isAdministrador()){
      System.out.println("6: Criar nova palavra proibida");
      System.out.println("7: Excluir palavra proibida");
      System.out.println("8: Acessar painel administrador");
    }

    System.out.println("9: Pesquisa por tag | palavra-chave");
    System.out.println("0: Trocar usuário");
    opcao = sc.nextInt();

    switch (opcao){

      case 1:
        if(!addPostagem())
          System.out.println("Algo deu errado");
        break;

    }
  }

  private boolean addUsuario(Usuario u){
    //adiciona pessoa
  }

  private boolean addPostagem(Postagem p){
    //adiciona postagem
  }

  private boolean removePostagem(int posicao) {
    //remove postagem
  }

}
