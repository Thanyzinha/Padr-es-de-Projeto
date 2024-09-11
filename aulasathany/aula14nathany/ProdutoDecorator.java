public abstract class ProdutoDecorator extends Produto {
    protected Produto produtoDecorado;

    public ProdutoDecorator(Produto produtoDecorado) {
        super(produtoDecorado.getNome(), produtoDecorado.getPreco());
        this.produtoDecorado = produtoDecorado;
    }

    @Override
    public abstract String getNome();

    @Override
    public abstract double getPreco();
}
