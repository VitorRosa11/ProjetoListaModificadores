
/**
 *
 * @author vitorb
 */
public class Produto {
    
public class Produto {
    private String nome;
    private double preco;
    
    // Construtor padrão
    public Produto() {
    }  
    
    // Construtor com nome
    public Produto(String nome) {
        this.nome = nome;
    }

    // Construtor com nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco); // Chama o método setPreco para validar o preço
    }

    // Método para exibir os detalhes do produto
    public void Exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    // Métodos Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    } 

    // Agora o setPreco impede valores negativos
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo!");
        }
    }
}

