public class Pagamento {
    enum Metodo { PIX, BOLETO, DEBITO, CREDITO }
    private static final double DESCONTO_PIX = 0.10;
    private static final double DESCONTO_BOLETO = 0.05;
    private static final double JUROS_CREDITO = 0.0399;

    public double calcularValorFinal(double valor, Metodo metodo, int parcelas) {
        if (metodo == Metodo.PIX) {
            return valor * (1 - DESCONTO_PIX);
        } else if (metodo == Metodo.BOLETO) {
            return valor * (1 - DESCONTO_BOLETO);
        } else if (metodo == Metodo.CREDITO) {
            return valor + (valor * JUROS_CREDITO * (parcelas - 1));
        } else {
            return valor;
        }
    }
}
