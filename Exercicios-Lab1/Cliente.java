
public class Cliente extends Pessoa
{
    private int pontos;
    
    public Cliente (String nome, int anoNascimento, int pontos) {
        super(nome, anoNascimento);
        this.pontos = pontos;
    }
    
    public int getPontos() {return pontos;}
}
