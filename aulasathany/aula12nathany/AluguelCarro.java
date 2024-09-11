public class AluguelCarro {
    enum TipoCarro { ECONOMICO, EXECUTIVO, LUXO }
    private static final double PRECO_ECONOMICO = 150.00;
    private static final double PRECO_EXECUTIVO = PRECO_ECONOMICO * 2.0;
    private static final double PRECO_LUXO = PRECO_EXECUTIVO * 2.0;

    public double calcularPreco(TipoCarro tipo, int dias) {
        double precoDiaria;
        if (tipo == TipoCarro.ECONOMICO) {
            precoDiaria = PRECO_ECONOMICO;
        } else if (tipo == TipoCarro.EXECUTIVO) {
            precoDiaria = PRECO_EXECUTIVO;
        } else {
            precoDiaria = PRECO_LUXO;
        }
        return precoDiaria * dias;
    }
}
