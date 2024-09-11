public class DescontoDecorator extends ProdutoDecorator {
    private double desconto;

    public DescontoDecorator(Produto produtoDecorado, double desconto) {
        super(produtoDecorado);
        this.desconto = desconto;
    }

    @Override
    public String getNome() {
        return produtoDecorado.getNome() + " (Desconto aplicado)";
    }

    @Override
    public double getPreco() {
        return produtoDecorado.getPreco() * (1 - desconto);
    }
}
