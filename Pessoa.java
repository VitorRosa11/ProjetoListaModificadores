
package projetolistamodificadores.javaex07;

/**
 *
 * @author vitorb
 */
public class Pessoa {
    
 protected int idade; 

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com idade
    public Pessoa(int idade) {
        this.setIdade(idade); 
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Erro: A idade não pode ser negativa!");
        }
    }
}

