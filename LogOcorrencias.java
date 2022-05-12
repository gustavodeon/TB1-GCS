import java.util.Date;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.*;

public class LogOcorrencias {
    // Método para registrar palavras proibidas, data e hora dentro de seu texto original
  
    private ArrayList<Log> log;

<<<<<<< HEAD
    private static final String MyLog = null;
    private ArrayList<LogOcorrencias> log;
    private Usuario usuario;
    private Date dataPostagem;
    private String conteudo;

    public void logOcorrencias(Usuario autor, String conteudo, Date dataPostagem) throws SecurityException, IOException {
        this.usuario = autor;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
        log = new ArrayList<>();
        FileHandler myHandler = new FileHandler ( " conteudo ");
        Logger myLogger = Logger.getLogger ( LogOcorrencias.class.getName ());
        myLogger.addHandler ( myHandler ) ;
        myLogger.info ( "Este é um evento log ");
=======
    public void logOcorrencias(Log l) {
        log = new ArrayList<>();
        log.add(l);
>>>>>>> 0ddcd8702019aa3f989a18919037487417a756fb
    }

    public int getQtdeOcorrenciasLog(){
        return log.size();
    }


    public LogOcorrencias(){

    }

<<<<<<< HEAD
    public Usuario getOcorrenciaAutor() {
        return usuario;
=======
    public Log getOcorrenciaAutor(Usuario user) {
        for (Log l:log){
            if(log.g)
        }
>>>>>>> 0ddcd8702019aa3f989a18919037487417a756fb
    }

    @Override
    public String toString() {
        return conteudo;
     
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
