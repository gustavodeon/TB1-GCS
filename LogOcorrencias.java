import java.util.ArrayList;

public class LogOcorrencias {
    // Método para registrar palavras proibidas, data e hora dentro de seu texto original
  

//  private Usuario usuario;
//  private String dataPostagem;
//  private String conteudo;
    private ArrayList<LogOcorrencias> log;

    LogOcorrencias() {
       log = new ArrayList<>();
    }
 
    public void armazena (Log log){
        log.add(log);
    }
public int getQuantidadeOcorrencias(){
    return log.size();
}

public String getOcorrencia(){
    String frase = "";
    for(int i=0; i<=log.size(); i++){
        frase = frase + log.get(i).toString() + "\n";
    }
    return frase;
}

@Override
    public String toString() {
        return "Usuario" + usuario + " data postagem" + dataPostagem + " conteudo" + conteudo;
        
     
    }

}