import java.util.Date;
import java.util.ArrayList;

public class LogOcorrencias {
    // Método para registrar palavras proibidas, data e hora dentro de seu texto original

    private ArrayList<LogOcorrencias> log;
    private Usuario usuario;
    private Date dataPostagem;
    private String conteudo;

    public void logOcorrencias(Usuario autor, String conteudo, Date dataPostagem) {
        this.usuario = autor;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
        log = new ArrayList<>();
        log.add(autor, conteudo, dataPostagem);
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


}
