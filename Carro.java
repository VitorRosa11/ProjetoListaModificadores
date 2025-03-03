
package projetolistamodificadores.javaex10;

/**
 *
 * @author vitorb
 */
public class Carro {
    
 private String marca;
    private String modelo;
    public int ano;

    // Construtor padrão
    public Carro() {
    }

    // Construtor com parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano); // Validação do ano
    }

    // Métodos Getters e Setters
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
        if (ano >= 1886) { // Valida se o ano é válido
            this.ano = ano;
        } else {
            System.out.println("Erro: O ano do carro não pode ser menor que 1886!");
        }
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}



