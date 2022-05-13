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

public LogOcorrencias getPorPosicao(int pos){
    if (pos>=0 && pos<log.size()){
        return log.get(pos);
    }else{
        return null;
    }
}
public LogOcorrencias getPorUsuario(Usuario user){

    
}
}
@Override
    public String toString() {
        log.forEach((n) -> System.out.println(n));
        
 }

}