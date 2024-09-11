import java.util.HashSet;
import java.util.Set;

public class Assinatura {
    private AssinaturaBase assinaturaBase = new AssinaturaBase();
    private Set<Pacote> pacotes = new HashSet<>();

    public static final Pacote PACOTE1 = new Pacote("Assistir vídeos em vários dispositivos", 19.99);
    public static final Pacote PACOTE2 = new Pacote("Frete Grátis em produtos", 9.99);
    public static final Pacote PACOTE3 = new Pacote("Caixa surpresa com produtos relacionados a filmes e séries", 29.99);
    public static final Pacote PACOTE4 = new Pacote("Cartão de crédito Platinum", 49.99);
    public static final Pacote PACOTE5 = new Pacote("Compra com Cash Back", 19.99);

    public void adicionarPacote(Pacote pacote) {
        if (!pacotes.contains(pacote)) {
            pacotes.add(pacote);
        } else {
            System.out.println("Pacote já adicionado: " + pacote);
        }
    }

    public double calcularPrecoTotal() {
        double total = assinaturaBase.getPreco();
        for (Pacote pacote : pacotes) {
            total += pacote.getPreco();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Assinatura Base: R$ " + assinaturaBase.getPreco());
        System.out.println("Pacotes Adicionados:");
        for (Pacote pacote : pacotes) {
            System.out.println(pacote);
        }
        System.out.printf("Valor Total: R$ %.2f%n", calcularPrecoTotal());
    }
}
