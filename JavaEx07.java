

package projetolistamodificadores.javaex07;

/**
 *
 * @author vitorb
 */
public class JavaEx07 {

    public static void main(String[] args) {
        
 Aluno aluno1 = new Aluno(18);
        aluno1.exibirIdade();

        aluno1.setIdade(-5); 
        aluno1.setIdade(20); 

        aluno1.exibirIdade();
    }
}

