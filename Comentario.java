import java.lang.reflect.Constructor;
import java.util.Date;

public class Comentario {
  
  private Usuario autor;
  private String conteudo;
  Date dataPostagem;
  private int likes;

  public Comentario(Usuario autor, String conteudo, Date dataPostagem) {
    this.autor = autor;
    this.conteudo = conteudo;
    this.dataPostagem = dataPostagem;
    this.likes = 0;
  }

  public Usuario getAutor() {return autor;}
  public Date getDataPostagem() {return dataPostagem;}
  public String getConteudo() {return conteudo;}
  public void addlike() { likes++; }
  public int getLikes() { return likes; }
}
