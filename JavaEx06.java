

package projetolistamodificadores.javaex06;

/**
 *
 * @author vitorb
 */
import java.util.Scanner;

public class JavaEx06 {

    public static void main(String[] args) {
        
        
    Scanner scanner = new Scanner(System.in);

        
        Usuario usuario = new Usuario("admin", "12345");

      
        System.out.print("Digite seu login: ");
        String loginDigitado = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();

        

