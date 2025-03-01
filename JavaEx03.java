

package projetolistamodificadores.javaex03;

/**
 *
 * @author vitorb
 */
public class JavaEx03 {

    public static void main(String[] args) {
       
     ContaBancaria conta = new ContaBancaria("João Silva", 1000.00);

       
        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        
        conta.depositar(500.00);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        
        conta.sacar(300.00);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());

        
        conta.sacar(2000.00);

        
        conta.sacar(-50.00);

        
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}

