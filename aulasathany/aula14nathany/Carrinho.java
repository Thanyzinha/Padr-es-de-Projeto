import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();
    private EstrategiaDesconto estrategia;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void setEstrategia(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double obterPrecoTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        if (estrategia != null) {
            total = estrategia.aplicarDesconto(total);
        }
        return total;
    }
}
