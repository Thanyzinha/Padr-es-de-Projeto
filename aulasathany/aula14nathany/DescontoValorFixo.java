public class DescontoValorFixo implements EstrategiaDesconto {
    private double valorDesconto;

    public DescontoValorFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double aplicarDesconto(double preco) {
        return preco - valorDesconto;
    }
}
