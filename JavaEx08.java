

package projetolistamodificadores.javaex08;

/**
 *
 * @author vitorb
 */
public class JavaEx08 {

    public static void main(String[] args) {
       Porta porta = new Porta(); 

        
        porta.abrir();
        porta.abrir(); 
        porta.fechar();
        porta.fechar(); 
       
        if (porta.isAberta()) {
            System.out.println("A porta está aberta.");
        } else {
            System.out.println("A porta está fechada.");
        }
    }
}
