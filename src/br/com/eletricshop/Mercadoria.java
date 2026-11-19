package br.com.eletricshop;


public abstract class Mercadoria {
    private Integer codigo;
    private String nome;
    private Float preco;
    private Float desconto;

    public Mercadoria(Integer codigo, String nome, Float preco, Float desconto){
        setCodigo(codigo);
        setPreco(preco);
        setNome(nome);
        setDesconto(desconto);
    }

// ----- Getters e Setters -----
    public Integer getCodigo(){
        return this.codigo;
    }

    public final void setCodigo(Integer codigo){
        this.codigo = codigo;
    }

    public Float getPreco(){
        return this.preco;
    }

    public final void setPreco(Float preco){
        if (preco == null) {
            throw new IllegalArgumentException("O valor nao pode ser nulo: " + preco);
        }
        
        if (preco < 0) {
            throw new IllegalArgumentException("O preço nao pode ter numeros negativos: " + preco);
        }
        
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public final void setNome(String nome){
        if (nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("O nome preenchido está vazio: " + nome);
        }
        this.nome = nome;
    }

    public Float getDesconto(){
        return this.desconto;
    }

    public final void setDesconto(Float desconto){
        if (desconto < 0) {
            throw new IllegalArgumentException("O desconto não pode ser negativo: " + desconto);
        }
        this.desconto = desconto;
    }
// ----- Fim dos Getters e Setters -----
    
    public abstract Float preco_a_vista();


}
