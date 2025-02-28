
package javaex01;

/**
 *
 * @author vitorb
 */
public class Produto {
    private String nome;
    private double preco;
    
    public Produto (){
        
    }  
 public Produto (String nome){
     this.nome = nome;
     
 }
  public Produto (String nome, double preco){
      this.nome = nome;
      this.preco = preco;
      
  }
  
  public void Exibir() {
      System.out.println("Nome:" + nome);
      System.out.println("Preço:" + preco);
  }
  public String getNome () {
      return this.nome;
  }
  public void setNome (String nome) {
      this.nome = nome;
  }
  public double getPreco (double preco){
      return this.preco;
  } 
  public void setPreco (double preco){
      this.preco = preco;
  }
  }



