import java.util.Date;
import java.util.ArrayList;

public class LogOcorrencias {
    // Método para registrar palavras proibidas, data e hora dentro de seu texto original
  
    private ArrayList<Log> log;

    public void logOcorrencias(Log l) {
        log = new ArrayList<>();
        log.add(l);
    }

    public int getQtdeOcorrenciasLog(){
        return log.size();
    }

    public getLogOcorrencias(){

    }

    public setLogOcorrencias(){

    }

    public Log getOcorrenciaAutor(Usuario user) {
        for (Log l:log){
            if(log.g)
        }
    }

    @Override
    public String toString() {
     
    }

private class Log {
    protected Usuario usuario;
    protected Date dataPostagem;
    protected String conteudo;
    protected int idLog;

public void Log (Usuario autor, String conteudo, Date dataPostagem) {
        this.usuario = autor;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
        this.idLog = 
}

public Usuario getPorUsuario(){
    return usuario;
}
public String getConteudo(){
    return conteudo;
}
public Date getDataPost(){
    return dataPostagem;
}

}
}
