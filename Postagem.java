import java.util.ArrayList;
import java.util.Date;

public class Postagem {
  
  private Usuario autor;
  private ArrayList<Comentario> comentarios;
  private Date dataPostagem;
  private String conteudo;
  private ArrayList<String> tags;
  private int likes;
  private String link;

  public Postagem(Usuario autor, Date dataPostagem, String conteudo, ArrayList<String> tags, String link){
    this.autor = autor;
    this.dataPostagem = dataPostagem;
    this.conteudo = conteudo;
    this.tags = tags;
    this.link = link;
    this.likes = 0;
  }

  public Usuario getAutor() { return autor;}
  public String getConteudo() {return conteudo;}
  public ArrayList<Comentario> getComentarios() {return comentarios;}
  public Date getDataPostagem() {return dataPostagem;}
  public ArrayList<String> getTags() {return tags;}
  public int getTotalComentarios() { return getComentarios() == null ? 0 : getComentarios().size(); }
  public void addlike() { likes++; }
  public int getLikes() { return likes; }

  public boolean addComentario(Comentario comentario){
    // adiciona comentario
	this.autor.addComentario();//arrumar posicao conforme a logica  
    return false;
  }

  public boolean removeComentario(int posicao, Usuario usuarioAtual) {
    //remove comentário
	  
	this.autor.removeComentario();//arrumar posicao conforme a logica  
    return false;
  }

  public String toString(){
    return dataPostagem.toString() + ";" + autor.getId() + ";" + this.getConteudo();
  }
}

