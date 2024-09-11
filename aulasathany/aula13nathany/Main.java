public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new Assinatura();

        assinatura.adicionarPacote(Assinatura.PACOTE1);
        assinatura.adicionarPacote(Assinatura.PACOTE2);
        assinatura.adicionarPacote(Assinatura.PACOTE3);
        assinatura.adicionarPacote(Assinatura.PACOTE4);
        assinatura.adicionarPacote(Assinatura.PACOTE5);

        assinatura.exibirDetalhes();
    }
}
