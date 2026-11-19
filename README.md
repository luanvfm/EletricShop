# EletricShop

Sistema comercial simples para uma loja de informática, feito em Java como parte da 4ª lista de exercícios de Programação Orientada a Objetos.

## Exercícios

- [x] 1. `Mercadoria`: classe abstrata com código, nome, preço e desconto, e o método abstrato `preco_a_vista()`
- [ ] 2. `Celular`: herda de `Mercadoria`
- [ ] 3. `Computador`: herda de `Mercadoria`, com configuração e desconto fixo de 10%
- [ ] 4. `Carrinho`: guarda as mercadorias de um cliente em um `ArrayList`
- [ ] 5. `TelaCarrinho`: menu para inserir, remover e listar mercadorias
- [ ] 6. `Produto`: encapsulamento e validação com `IllegalArgumentException`

## Estrutura

- `src/br/com/eletricshop/`: código-fonte
- `bin/`: arquivos compilados (`.class`)

## Como compilar e rodar

```bash
javac -d bin src/br/com/eletricshop/*.java
java -cp bin br.com.eletricshop.App
```
