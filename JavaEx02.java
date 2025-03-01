

package projetolistamodificadores.javaex02;

/**
 *
 * @author vitorb
 */
public class JavaEx02 {

    public static void main(String[] args) {
       
      
 Produto p1 = new Produto("Bolacha", 2.54);
        Produto p2 = new Produto("Cerveja");
        Produto p3 = new Produto();

        // Exibindo informações do produto
        p1.Exibir();

        // Alterando nome e preço (com validação de preço)
        p1.setNome("Bolacha Maria");
        p1.setPreco(-1.00); // Aqui deve mostrar uma mensagem de erro
        p1.setPreco(2.53); // Agora com um preço válido
        
        // Exibir novamente para ver a mudança
        p1.Exibir();

        // Exibir o nome do produto p2
        System.out.println("Produto: " + p2.getNome());
    }
}
