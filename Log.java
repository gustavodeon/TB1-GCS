public class Log {
    private Usuario usuario;
    private String dataPostagem;
    private String conteudo;

    public Log(Usuario autor, String conteudo, String dataPostagem) {
        this.usuario = autor;
        this.conteudo = conteudo;
        this.dataPostagem = dataPostagem;
    }

    public Usuario getUsuario(){
        return usuario;
    }
    public String getPostagem(Usuario user){
        return conteudo;
    }

    @Override
    public String toString() {
        return "Usuario" + usuario + " data postagem" + dataPostagem + " conteudo" + conteudo;

    }
}
