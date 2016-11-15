
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
    
}
