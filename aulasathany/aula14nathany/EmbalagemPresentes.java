public class EmbalagemPresentes extends ProdutoDecorator {
    private double custoAdicional;

    public EmbalagemPresentes(Produto produtoDecorado, double custoAdicional) {
        super(produtoDecorado);
        this.custoAdicional = custoAdicional;
    }

    @Override
    public String getNome() {
        return produtoDecorado.getNome() + " (Embalagem para presente)";
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco() + custoAdicional;
    }
}
