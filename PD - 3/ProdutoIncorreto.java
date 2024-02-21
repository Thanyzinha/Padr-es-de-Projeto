public class ProdutoIncorreto {
    private String nome;
    private double preco;
    
    public ProdutoIncorreto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    // Método para calcular o desconto - mistura de responsabilidades
    public double calcularDesconto() {
        if (preco > 100) {
            return preco * 0.1;
        } else {
            return 0;
        }
    }
    
    // Método para exibir informações do produto - outra mistura de responsabilidades
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Desconto: " + calcularDesconto());
    }
}
