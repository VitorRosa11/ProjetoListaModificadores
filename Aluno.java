
package projetolistamodificadores.javaex07;

/**
 *
 * @author vitorb
 */
public class Aluno extends Pessoa {
    
    
    public Aluno(int idade) {
        super(idade);
    }

   
    public void exibirIdade() {
        System.out.println("Idade do aluno: " + getIdade());
    }
}

    

