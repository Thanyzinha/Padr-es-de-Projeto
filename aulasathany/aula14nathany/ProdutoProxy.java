public class ProdutoProxy extends Produto {
    private Produto produtoReal;

    public ProdutoProxy(Produto produtoReal) {
        super(produtoReal.getNome(), produtoReal.getPreco());
        this.produtoReal = produtoReal;
    }

    @Override
    public String getNome() {
        // Simula o acesso ao banco de dados
        return produtoReal.getNome();
    }

    @Override
    public double getPreco() {
        // Simula o acesso ao banco de dados
        return produtoReal.getPreco();
    }
}
