package br.com.eletricshop;

public class Computador extends Mercadoria {
    
    private String configuracao;

    public Computador(String nome, Float preco, String configuracao){
        super(nome, preco, 10.0f);
        setConfiguracao(configuracao);
    }

    public String getConfiguracao(){
        return configuracao;
    }

    public void setConfiguracao(String config){
        if(config == null) {
            throw new IllegalArgumentException("O valor da configuração não pode ser nulo: " + config);
        }
        if (config.isEmpty() || config.isBlank()) {
            throw new IllegalArgumentException("A config preenchida está vazia: " + config);
        }
        this.configuracao = config;
    }

    @Override 
    public Float preco_a_vista(){
        return getPreco()-getDesconto()*getPreco()/100;
    }
}
