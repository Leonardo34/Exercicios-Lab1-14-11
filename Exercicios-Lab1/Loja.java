
public class Loja
{
    private Pessoa[] p;
    
    public Loja(int tamanho) {
        p = new Pessoa[tamanho];
        int r = 0, count = 0;
        for (int i = 0; i < p.length; i++) {
            int ano = 1940 + (int) (Math.random() * 73);
            r = 1 + (int) (Math.random() * 2);
            
            if(r == 1) {
                p[i] = new Pessoa ("P" + count++, ano);
            }
            else {
                p[i] = new Cliente ("C" + count++, ano, (int) (Math.random() * 1000));
            }
        }
    }
    
    public Pessoa[] getP() {return p;}
    
    public void exibeArray() {
        for(int i = 0; i < p.length; i++) {
            if (p[i] instanceof Cliente) {
                System.out.println("Nome: " + p[i].getNome());
                System.out.println("Ano de Nascimento: " + p[i].getAnoNascimento());
                System.out.println("Pontos: " + ((Cliente)p[i]).getPontos());
            }
            else if(p[i] instanceof Pessoa) {
                System.out.println("Nome: " + p[i].getNome());
                System.out.println("Ano de Nascimento: " + p[i].getAnoNascimento());
            }
        }
    }
    
    public Pessoa[] ordenaPorAno() {
        Pessoa[] aux = new Pessoa[p.length];
        Pessoa pessoa;
        for(int i = 0; i < p.length; i++) {
            aux[i] = p[i];
        }
        for(int i = 0; i < aux.length - 1; i++) {
            for(int j = i + 1; j < aux.length; j++) {
                if(aux[i] != null && aux[j] != null) {
                    if(aux[i].getAnoNascimento() > aux[j].getAnoNascimento()) {
                        pessoa = aux[i];
                        aux[i] = aux[j];
                        aux[j] = pessoa;
                    }
                }
            }
        }
        return aux;
    }
}
