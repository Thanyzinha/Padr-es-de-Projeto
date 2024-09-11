public class Main {
    public static void main(String[] args) {
        PacoteViagemFacade facade = new PacoteViagemFacade();

        facade.gerarPacote(
            "João Silva", "123.456.789-00", 
            PassagemAerea.Classe.EXECUTIVA, 
            "4", "A", 
            ReservaHotel.TipoQuarto.EXECUTIVO, 2, 
            AluguelCarro.TipoCarro.LUXO, 5, 
            Pagamento.Metodo.CREDITO, 3
        );
    }
}
