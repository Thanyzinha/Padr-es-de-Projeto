public class Main {
    public static void main(String[] args) {
        Produto produtoBasico = new Produto("Produto Básico", 100.00);
        ProdutoProxy produtoProxy = new ProdutoProxy(produtoBasico);

        Produto produtoEmbalado = new EmbalagemPresentes(produtoProxy, 20.00);
        Produto produtoComDesconto = new DescontoDecorator(produtoEmbalado, 0.10);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produtoComDesconto);

        // Define uma estratégia de desconto
        carrinho.setEstrategia(new DescontoValorFixo(10.00));

        System.out.println("Preço Total: R$ " + carrinho.obterPrecoTotal());
    }
}
