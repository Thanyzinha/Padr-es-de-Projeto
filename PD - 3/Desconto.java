public class Desconto {
    // Método para calcular o desconto
    public double calcularDesconto(double preco) {
        if (preco > 100) {
            return preco * 0.1;
        } else {
            return 0;
        }
    }
}

