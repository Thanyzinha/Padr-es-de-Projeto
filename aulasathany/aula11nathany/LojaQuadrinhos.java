import java.util.List;

// Classe principal para execução
public class LojaQuadrinhos {
    public static void main(String[] args) {
        CaixaAssinatura caixaAssinatura = new CaixaAssinatura();
        String nivelCliente = "OURO"; // Nível do cliente
        List<Item> caixa = caixaAssinatura.gerarCaixa(nivelCliente);
        double valorTotal = caixaAssinatura.calcularValorTotal(caixa);
        
        System.out.println("Itens da Caixa para nível " + nivelCliente + ":");
        for (Item item : caixa) {
            System.out.println(item);
        }
        System.out.printf("Valor total da caixa: R$ %.2f%n", valorTotal);
    }
}
