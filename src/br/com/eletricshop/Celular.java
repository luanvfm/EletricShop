package br.com.eletricshop;

public class Celular extends Mercadoria {
    
    public Celular(String nome, Float preco, Float desconto){
       super(nome, preco, desconto);
    }
    
    @Override
    public Float preco_a_vista() {
        return getPreco() - getPreco()*getDesconto()/100;
    }
}
