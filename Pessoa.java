
public class Pessoa {
    public Integer id;
	public String nome;
	public String tipo;

    public Pessoa (Integer id, String nome, String tipo){
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Integer getId (){
        return id;
    }
}