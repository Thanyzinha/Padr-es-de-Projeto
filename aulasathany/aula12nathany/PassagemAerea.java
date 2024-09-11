public class PassagemAerea {
    enum Classe { ECONOMICA, EXECUTIVA, PRIMEIRA }
    private static final double PRECO_ECONOMICA = 500.00;
    private static final double PRECO_EXECUTIVA = PRECO_ECONOMICA * 2.5;
    private static final double PRECO_PRIMEIRA = PRECO_EXECUTIVA * 2.5;

    public double calcularPreco(Classe classe, String fileira, String assento) {
        if (classe == Classe.ECONOMICA) {
            return PRECO_ECONOMICA;
        } else if (classe == Classe.EXECUTIVA) {
            return PRECO_EXECUTIVA;
        } else {
            return PRECO_PRIMEIRA;
        }
    }
}
