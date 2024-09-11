public class PacoteViagemFacade {
    private PassagemAerea passagemAerea = new PassagemAerea();
    private ReservaHotel reservaHotel = new ReservaHotel();
    private AluguelCarro aluguelCarro = new AluguelCarro();
    private Pagamento pagamento = new Pagamento();

    public void gerarPacote(String nome, String cpf, 
                            PassagemAerea.Classe classePassagem, 
                            String fileiraPassagem, String assentoPassagem,
                            ReservaHotel.TipoQuarto tipoQuarto, int numPessoas, 
                            AluguelCarro.TipoCarro tipoCarro, int diasCarro, 
                            Pagamento.Metodo metodoPagamento, int parcelas) {
        double precoPassagem = passagemAerea.calcularPreco(classePassagem, fileiraPassagem, assentoPassagem);
        double precoHotel = reservaHotel.calcularPreco(tipoQuarto, numPessoas);
        double precoCarro = aluguelCarro.calcularPreco(tipoCarro, diasCarro);
        double precoTotal = precoPassagem + precoHotel + precoCarro;
        double valorFinal = pagamento.calcularValorFinal(precoTotal, metodoPagamento, parcelas);

        System.out.println("Dados do Comprador:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);

        System.out.println("\nDados da Compra:");
        System.out.println("Passagem: " + classePassagem + " - Fileira: " + fileiraPassagem + " Assento: " + assentoPassagem);
        System.out.println("Hotel: " + tipoQuarto + " - Total: R$ " + precoHotel);
        System.out.println("Carro: " + tipoCarro + " - Total: R$ " + precoCarro);
        System.out.println("Forma de Pagamento: " + metodoPagamento);
        System.out.println("Parcelas: " + parcelas + " - Valor Final: R$ " + valorFinal);
    }
}
