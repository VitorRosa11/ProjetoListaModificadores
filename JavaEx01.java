
package javaex01;

/**
 *
 * @author vitorb
 */
public class JavaEx01 {

   
    public static void main(String[] args) {
        Produto p1 = new Produto("Bolacha", 2.54);
        Produto p2 = new Produto("Cerveja");
        Produto p3 = new Produto();
       p1.Exibir();
       p1.setNome("Bolacha Maria");
       p1.setPreco(2.53);
       p1.Exibir();
       
        System.out.println("Produto:" + p2.getNome());
        
    }
    
}
