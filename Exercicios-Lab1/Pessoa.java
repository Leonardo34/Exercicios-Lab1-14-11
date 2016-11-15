
public class Pessoa
{
    private String nome;
    private int anoNascimento;
    
    public Pessoa (String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
    
    public String getNome() {return nome;}
    
    public int getAnoNascimento() {return anoNascimento;}
}
