
package projetolistamodificadores.javaex10;

/**
 *
 * @author vitorb
 */
public class JavaEx10 {

    public static void main(String[] args) {
       
  Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.exibirInformacoes();

        System.out.println();

        Carro carro2 = new Carro();
        carro2.setMarca("Ford");
        carro2.setModelo("Mustang");
        carro2.setAno(1965);
        carro2.exibirInformacoes();

        System.out.println();

        // Testando ano inválido
        Carro carro3 = new Carro("Fiat", "Uno", 1800);
        carro3.exibirInformacoes(); // Não deve aceitar o ano 1800
    }
}

