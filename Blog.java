import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Blog {
  ArrayList<Usuario> usuarios;
  ArrayList<Postagem> postagens;
  Usuario userAtual;

  public Blog(){
    this.usuarios = new ArrayList<Usuario>();
    this.postagens = new ArrayList<Postagem>();
  }

  public void inicalizar(){
    //Programa roda aqui
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

  private void escreveCSV(){
    ArrayList<Postagem> postagensUser = buscaPostagens(userAtual);
    try (PrintWriter writer = new PrintWriter(new File(userAtual.getId()+".csv"))) {
        
        StringBuilder sb = new StringBuilder();
        for(Postagem p : postagensUser){
            sb.append(p.toString());
            sb.append('\n');
        }

        writer.write(sb.toString());
        writer.close();

    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
  }

  private ArrayList<Postagem> buscaPostagens(Usuario user){
    ArrayList<Postagem> postagensUser = new ArrayList<Postagem>();
    for(Postagem p: postagens){
      if(p.getAutor().getId()==user.getId()){
        postagensUser.add(p);
      }
    }
    return postagensUser;
  }

  private ArrayList<Postagem> buscaPostagens(String chave){
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
    return postagensPalavraChave;
  }
}
