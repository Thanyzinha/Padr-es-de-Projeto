public class ReservaHotel {
    enum TipoQuarto { SIMPLES, EXECUTIVO, SUITE }
    private static final double PRECO_SIMPLES = 200.00;
    private static final double PRECO_EXECUTIVO = PRECO_SIMPLES * 2.5;
    private static final double PRECO_SUITE = PRECO_EXECUTIVO * 3.0;

    public double calcularPreco(TipoQuarto tipo, int numPessoas) {
        double precoPorPessoa;
        if (tipo == TipoQuarto.SIMPLES) {
            precoPorPessoa = PRECO_SIMPLES;
        } else if (tipo == TipoQuarto.EXECUTIVO) {
            precoPorPessoa = PRECO_EXECUTIVO;
        } else {
            precoPorPessoa = PRECO_SUITE;
        }
        return precoPorPessoa * numPessoas;
    }
}
