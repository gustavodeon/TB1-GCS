import java.util.Date;
import java.util.ArrayList;

public class LogOcorrencias {
    // Método para registrar palavras proibidas, data e hora dentro de seu texto original
  
    private ArrayList<Log> log;

    public void logOcorrencias(Log l) {
        log = new ArrayList<>();
        log.add(l);
    }


    public getLogOcorrencias(){

    }

    public setLogOcorrencias(){

    }

    public getOcorrenciaAutor() {
        return usuario;
    }

    @Override
    public String toString() {
     
    }

private class Log {
    protected Usuario usuario;
    protected Date dataPostagem;
    protected String conteudo;

public void Log (Usuario autor, String conteudo, Date dataPostagem) {
        this.usuario = autor;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;

}

}
}
