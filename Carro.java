
package projetolistamodificadores.javaex10;

/**
 *
 * @author vitorb
 */
public class Carro {
    
 private String marca;
    private String modelo;
    public int ano;

   
    public Carro() {
    }

    
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); 
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886) { 
            this.ano = ano;
        } else {
            System.out.println("Erro: O ano do carro não pode ser menor que 1886!");
        }
    }

    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}



