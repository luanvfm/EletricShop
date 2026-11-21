package br.com.eletricshop;

import java.util.Scanner;

public class TelaCarrinho {
    private Scanner scanner = new Scanner(System.in);
    private Carrinho carrinho;
    private Integer escolha;

    public TelaCarrinho(String nomeCliente){
        carrinho = new Carrinho(nomeCliente);
        do {
            menu();
        } while (escolha != 0);
    }

    public void menu(){
        displayMenu();
        escolhas();
    }

    private void escolhas(){
        escolha = scanner.nextInt();

        switch (escolha) {
            // Caso escolha adicionar.
            case 1:
                Integer escolhaCelComp = displayCelularComputador();
                switch (escolhaCelComp) {
                    //Adicionar Celular
                    case 1:
                        carrinho.cadastrar(inputCelular());
                        break;
                    //Adicionar Computador
                    case 2:
                        carrinho.cadastrar(inputComputador());
                        break;
                    //Opcao Invalida
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
                break;
            case 2:
                // Caso escolha remover
                telaRemocao();
                break;
            case 3:
                telaConteudo();
                break;
            case 0:
                escolha = 0;
                System.out.println("Obrigado por utilizar o APP, até mais!");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private void displayMenu(){
        System.out.println("\n ---------- Bem vindo ao seu Carrinho ----------");
        System.out.println("1 - Inserir Mercadorias no carrinho");
        System.out.println("2 - Remover Mercadorias do carrinho");
        System.out.println("3 - Listar Mercadorias no carrinho \n");
        System.out.println("0 - Sair");
    }

    private Integer displayCelularComputador(){
        System.out.println("\n---------- 1 - Você esta comprando um Celular? ----------");
        System.out.println("\n------- 2 - Você esta comprando um Computador? -------");
        Integer escolhaCelComp = scanner.nextInt();
        return escolhaCelComp;
    }

    private void telaRemocao(){
        System.out.println("Digite o codigo do produto a ser removido:");
        Integer codigo = scanner.nextInt();

        Mercadoria produtoARemover = carrinho.procurar(codigo);
        carrinho.remover(produtoARemover);
    }

    private void telaConteudo(){
        carrinho.conteudo();
    }
    private Celular inputCelular(){
        System.out.println("Digite o nome do celular: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do celular: ");
        Float preco = scanner.nextFloat();

        System.out.println("Digite o desconto do celular: ");
        Float desconto = scanner.nextFloat();

        Celular celular = new Celular(nome, preco,desconto);
        return celular;
    }

    private Computador inputComputador(){
        System.out.println("Digite o nome do computador: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do computador: ");
        Float preco = scanner.nextFloat();

        System.out.println("Digite a configuracao do computador: ");
        String desconto = scanner.nextLine();

        return new Computador(nome, preco, desconto);
    }

}
