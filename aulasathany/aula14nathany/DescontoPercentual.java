public class DescontoPercentual implements EstrategiaDesconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double aplicarDesconto(double preco) {
        return preco * (1 - percentual);
    }
}
