import java.util.Date;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.*;

public class LogOcorrencias {
    // Método para registrar palavras proibidas, data e hora dentro de seu texto original

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
    }



    public LogOcorrencias(){

    }

    public Usuario getOcorrenciaAutor() {
        return usuario;
    }

    @Override
    public String toString() {
        return conteudo;
     
    }


}
