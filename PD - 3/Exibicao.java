public class Exibicao {
    // Método para exibir informações do produto
    public void exibirInformacoes(Produto produto, Desconto desconto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Desconto: " + desconto.calcularDesconto(produto.getPreco()));
    }
}
