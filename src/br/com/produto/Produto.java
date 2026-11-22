package br.com.produto;

public class Produto {
    private Integer codigo;
    private Integer proximoCodigo = 1;
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco){
        codigo = proximoCodigo;
        proximoCodigo++;
        this.nome = nome;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("O nome inserido é nulo: " + nome);
        }
        if (nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("O nome inserido esta vazio: " + nome);
        }
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco == null) {
            throw new IllegalArgumentException("O preco nao pode ser nulo: " + preco);
        }
        if (preco < 0) {
            throw new IllegalArgumentException("O preço nao pode ser negativo" + preco);
        }
        this.preco = preco;
    }

}
