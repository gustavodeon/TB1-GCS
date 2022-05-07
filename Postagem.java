import java.util.ArrayList;
import java.util.Date;

public class Postagem {
  
  private Usuario autor;
  private ArrayList<Comentario> comentarios;
  private Date dataPostagem;
  private String conteudo;
  private ArrayList<String> tags;

  public Postagem(Usuario autor, Date dataPostagem, String conteudo, ArrayList<String> tags){
    this.autor = autor;
    this.dataPostagem = dataPostagem;
    this.conteudo = conteudo;
    this.tags = tags;

  }

  public boolean addComentario(Comentario comentario){
    // adiciona comentario
  }

  public boolean removeComentario(int posicao, Usuario usuarioAtual) {
    //remove comentário
  }
}

