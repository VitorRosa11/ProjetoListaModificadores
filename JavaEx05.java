

package projetolistamodificadores.javaex05;

/**
 *
 * @author vitorb
 */
public class JavaEx05 {

    public static void main(String[] args) {
       
   Funcionario funcionario = new Funcionario("Carlos Silva", 3500.00);

        
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário: R$" + funcionario.getSalario());

       
        funcionario.setSalario(-500.00);

     
        System.out.println("\nApós tentativa de alteração:");
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário: R$" + funcionario.getSalario());
    }
}
