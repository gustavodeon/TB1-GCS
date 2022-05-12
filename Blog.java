import java.util.ArrayList;

public class Blog {
  protected ArrayList<Usuario> usuarios;
  protected ArrayList<Postagem> postagens;
  protected Usuario userAtual;
  protected ArrayList<String> palavrasProibidas;
  private RegrasNegocio rN;

  public Blog(){
    this.usuarios = new ArrayList<Usuario>();
    this.postagens = new ArrayList<Postagem>();
    this.palavrasProibidas = new ArrayList<String>();
    this.rN = new RegrasNegocio();
  }

  public void inicalizar(){
    //Programa roda aqui
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
}
