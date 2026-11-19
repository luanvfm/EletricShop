package br.com.eletricshop;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Celular iphoneX = new Celular("Iphone-X", 1000.0f, 3.0f);
        System.out.println(iphoneX.preco_a_vista());

        Computador macintosh = new Computador("Macintosh", 10000.00f, "Mockup config for macintosh");
        System.out.println("O preço a vista do Macintosh é: " + macintosh.preco_a_vista() + "\nCom desconto de: " + macintosh.getDesconto() + "E seu código é: " + macintosh.getCodigo());
    }
}
