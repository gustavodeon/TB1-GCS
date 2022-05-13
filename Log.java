public class Log {
    private Usuario usuario;
    private String dataPostagem;
    private String conteudo;

    public Log(Usuario autor, String conteudo, String dataPostagem) {
        this.usuario = autor;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
    }
    
}
