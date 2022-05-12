public class Usuario {

  private int id, totalComentarios, totalPostagens;
  private String nome;
  private boolean administrador;

  Usuario(int id, String nome, Boolean administrador){
    this.id = id;
    this.nome = nome;
    this.administrador = administrador;
    this.totalComentarios = 0;
    this.totalPostagens= 0;
  }

  public int getId() {return id;}
  public String getNome() {return nome;}
  public int getTotalComentarios() { return totalComentarios; }
  public int getTotalPostagens() { return totalPostagens; }
  
  public void addComentario() { totalComentarios+= 1; }// add +1 no contador de comentario do usuario
  public void removeComentario() { totalComentarios-= 1; }//-1 no contador de comentario do usuario
  
  public void addPostagem() { totalPostagens+= 1; }// add +1 no contador de postagem do usuario
  public void removePostagem() { totalPostagens-= 1; }//-1 no contador de postagem do usuario
  
  public boolean isAdministrador(){
    return this.administrador;
  }
}
