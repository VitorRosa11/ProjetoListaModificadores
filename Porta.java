
package projetolistamodificadores.javaex08;

/**
 *
 * @author vitorb
 */
public class Porta {
    
 private boolean aberta; 

    
    public Porta() {
        this.aberta = false;
    }

    
    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A porta foi aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    
    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A porta foi fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }
    public boolean isAberta() {
        return aberta;
    }
}


