

/**
 *
 * @author vitorb
 */
public class ContaBancaria {
    
    public String titular;
    private double saldo;   

    
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial > 0 ? saldoInicial : 0;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para saque.");
        } else {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        }
    }

    
    public double getSaldo() {
        return saldo;
    }
}
 
    

