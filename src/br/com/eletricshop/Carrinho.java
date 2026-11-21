package br.com.eletricshop;
import java.util.ArrayList;

public class Carrinho {
    private Integer codigoCliente;
    private static Integer proximoCodigo = 1;
    private String nomeCliente;
    private ArrayList<Mercadoria> conjuntoMercadorias;
    private static final Integer limiteDoCarrinho = 100;

    public Carrinho(String nomeCliente){
        this.codigoCliente = proximoCodigo;
        proximoCodigo++;
        setNomeCliente(nomeCliente);
        conjuntoMercadorias = new ArrayList<>();
    }
    // Getters e Setters
    public final Integer getCodigoCliente(){
        return this.codigoCliente;
    }
    
    public final String getNomeCliente(){
        return this.nomeCliente;
    }
    public final void setNomeCliente(String nome){
        if(nome == null) {
            throw new IllegalArgumentException("Nome não pode ser nulo: " + nome);
        }

        if (nome.isEmpty() || nome.isBlank()) {
            throw new IllegalArgumentException("O nome preenchido está vazio: " + nome);
        }
        this.nomeCliente = nome;
    }

    public final ArrayList<Mercadoria> getConjuntoMercadorias() {
        return conjuntoMercadorias;
    }
    //Codigo morto
    // public final void setConjuntoMercadorias(ArrayList<Mercadoria> conjuntoMercadorias) {
    //     this.conjuntoMercadorias = conjuntoMercadorias;
    // }

    // Fim dos Getters e Setters

    public Mercadoria procurar(Integer codigo) {
        if (codigo == null) {
            throw new IllegalArgumentException("Codigo da Mercadoria não pode ser nulo: " + codigo);
        }
        if (codigo < 0) {
            throw new IllegalArgumentException("Codigo da Mercadoria não pode ser negativo: " + codigo);
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

    public void cadastrar(Mercadoria m){
        if(m == null) {
            throw new IllegalArgumentException("Mercadoria Inserida é nula: " + m);
        }
        if(conjuntoMercadorias.size() < limiteDoCarrinho) {
            conjuntoMercadorias.add(m);
        } else {
            throw new IndexOutOfBoundsException("O limite do conjunto de mercadorias no carrinho esta fora do escopo: " + conjuntoMercadorias + "\n Limite é: " + limiteDoCarrinho);
        }
    }

    public void remover(Mercadoria m) {
        if (m == null) {
            throw new IllegalArgumentException("A mercadoria não pode ser nula: " + m);
        }
        for(Mercadoria mercadoriatemp : conjuntoMercadorias) {
            if (mercadoriatemp.equals(m)) {
                conjuntoMercadorias.remove(m);
                return;
            }
        }
        throw new IllegalArgumentException("A mercadoria não pôde ser encontrada: " + m);
    }

    public void conteudo(){
        // Soma todos os valores
        Float valorTotal = 0f;
        for (int i = 0; i < conjuntoMercadorias.size(); i ++) {
            valorTotal = valorTotal + conjuntoMercadorias.get(i).getPreco();
        } 
        // Impressão
        for(int i = 0; i < conjuntoMercadorias.size(); i++) {
            System.out.println("Codigo da Mercadoria: " + conjuntoMercadorias.get(i).getCodigo() + "\n");
            System.out.println("Nome da Mercadoria: " + conjuntoMercadorias.get(i).getNome() + "\n");
            System.out.println("Preço da Mercadoria: " + conjuntoMercadorias.get(i).getPreco() + "\n");
        }
        System.out.println("\nTotal de Mercadorias: " + conjuntoMercadorias.size() + "\n");
        System.out.println("Valor total das mercadorias é: " + valorTotal + "\n");
    }
}
