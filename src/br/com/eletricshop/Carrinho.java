package br.com.eletricshop;
import java.util.ArrayList;

public class Carrinho {
    private Integer codigoCliente;
    private static Integer proximoCodigo = 1;
    private String nomeCliente;
    private ArrayList<Mercadoria> conjuntoMercadorias;

    public Carrinho(String nomeCliente, ArrayList<Mercadoria> mercadorias){
        this.codigoCliente = proximoCodigo;
        proximoCodigo++;
        this.nomeCliente = nomeCliente;
        this.conjuntoMercadorias = mercadorias;
    }
    // Getters e Setters
    public Integer getCodigoCliente(){
        return this.codigoCliente;
    }
    
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }

    public ArrayList<Mercadoria> getConjuntoMercadorias() {
        return conjuntoMercadorias;
    }
    public void setConjuntoMercadorias(ArrayList<Mercadoria> conjuntoMercadorias) {
        this.conjuntoMercadorias = conjuntoMercadorias;
    }
    // Fim dos Getters e Setters

    public Mercadoria procurar(Integer codigo) {
        if (codigo == null) {
            throw new IllegalArgumentException("Codigo do Cliente não pode ser nulo: " + codigo);
        }
        if (codigo < 0) {
            throw new IllegalArgumentException("Codigo do cliente não pode ser negativo: " + codigo);
        }
        // Percorre a lista de Mercadorias
        if (conjuntoMercadorias != null && conjuntoMercadorias.size() != 0) {
            for(int i = 0; i < conjuntoMercadorias.size(); i++) {
                if (codigo.equals(conjuntoMercadorias.get(i).getCodigo())) {
                    Mercadoria mercadoriaEncontrada = conjuntoMercadorias.get(i);
                    return mercadoriaEncontrada;
                }
            }
            return null;
        } else {
            System.out.println("Carrinho se encontra vazio neste momento: " + conjuntoMercadorias);
            return null;
        }
         
    }

}
