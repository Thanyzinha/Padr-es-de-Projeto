import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Classe para gerar uma caixa de assinatura
public class CaixaAssinatura {
    private static final Item[] ITENS = {
        new Item("Quadrinhos", 15.00),
        new Item("Chaveiros", 5.00),
        new Item("Bustos", 10.00),
        new Item("Adesivos", 1.00),
        new Item("Posters", 25.00),
        new Item("Camisetas", 25.00),
        new Item("Canetas", 3.00),
        new Item("Miniaturas", 20.00)
    };

    private Random random = new Random();

    public List<Item> gerarCaixa(String nivel) {
        int numeroDeItens = obterNumeroDeItens(nivel);
        List<Item> caixa = new ArrayList<>();
        
        for (int i = 0; i < numeroDeItens; i++) {
            Item item = ITENS[random.nextInt(ITENS.length)];
            caixa.add(item);
        }
        return caixa;
    }

    private int obterNumeroDeItens(String nivel) {
        switch (nivel.toUpperCase()) {
            case "BRONZE": return 3;
            case "PRATA": return 5;
            case "OURO": return 7;
            case "PLATINA": return 10;
            default: throw new IllegalArgumentException("Nível desconhecido: " + nivel);
        }
    }

    public double calcularValorTotal(List<Item> caixa) {
        double total = 0;
        for (Item item : caixa) {
            total += item.getPreco();
        }
        return total;
    }
}
