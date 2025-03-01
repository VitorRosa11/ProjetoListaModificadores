
/**
 *
 * @author vitorb
 */
public class Produto {
    
public class Produto {
    private String nome;
    private double preco;
    
    
    public Produto() {
    }  
    
    
    public Produto(String nome) {
        this.nome = nome;
    }

   
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco); 
    }

    
    public void Exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    } 

    
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo!");
        }
    }
}

