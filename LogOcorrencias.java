import java.util.ArrayList;

public class LogOcorrencias {
    // Método para registrar palavras proibidas, data e hora dentro de seu texto original
  

    private Usuario usuario;
    private String dataPostagem;
    private String conteudo;
    private ArrayList<LogOcorrencias> array;

    LogOcorrencias(Usuario autor, String conteudo, String dataPostagem) {
        this.usuario = autor;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
    }
 
    public void armazena (Usuario autor, String conteudo, String dataPostagem){
        LogOcorrencias ocorrencias = new LogOcorrencias(autor, conteudo, dataPostagem);
        array.add(ocorrencias);
    }

    @Override
    public String toString() {
        return "Usuario" + usuario + " data postagem" + dataPostagem + " conteudo" + conteudo;
        
     
    }

}