import java.util.ArrayList;
import java.util.List;

interface Transporte {
    void exibirInformacoes();
    void embarcarPassageiro(String nomePassageiro);
    void desembarcarPassageiro(String nomePassageiro);
}

class Onibus implements Transporte {
    private int capacidade;
    private String metodoPagamento;
    private String rota;
    private List<String> passageiros;

    public Onibus(int capacidade, String metodoPagamento, String rota) {
        this.capacidade = capacidade;
        this.metodoPagamento = metodoPagamento;
        this.rota = rota;
        this.passageiros = new ArrayList<>();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Ônibus - Capacidade: " + capacidade);
        System.out.println("Método de Pagamento: " + metodoPagamento);
        System.out.println("Rota: " + rota);
    }

    @Override
    public void embarcarPassageiro(String nomePassageiro) {
        if (passageiros.size() < capacidade) {
            passageiros.add(nomePassageiro);
            System.out.println(nomePassageiro + " embarcou no ônibus.");
        } else {
            System.out.println("O ônibus está cheio. " + nomePassageiro + " não pôde embarcar.");
        }
    }

    @Override
    public void desembarcarPassageiro(String nomePassageiro) {
        if (passageiros.contains(nomePassageiro)) {
            passageiros.remove(nomePassageiro);
            System.out.println(nomePassageiro + " desembarcou do ônibus.");
        } else {
            System.out.println(nomePassageiro + " não está no ônibus.");
        }
    }
}

// Implementação concreta para metrô
class Metro implements Transporte {
    private int capacidade;
    private int velocidadeMedia;
    private String linha;
    private List<String> passageiros;

    public Metro(int capacidade, int velocidadeMedia, String linha) {
        this.capacidade = capacidade;
        this.velocidadeMedia = velocidadeMedia;
        this.linha = linha;
        this.passageiros = new ArrayList<>();
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Metrô - Capacidade: " + capacidade);
        System.out.println("Velocidade Média: " + velocidadeMedia + " km/h");
        System.out.println("Linha: " + linha);
    }

    @Override
    public void embarcarPassageiro(String nomePassageiro) {
        if (passageiros.size() < capacidade) {
            passageiros.add(nomePassageiro);
            System.out.println(nomePassageiro + " embarcou no metrô.");
        } else {
            System.out.println("O metrô está lotado. " + nomePassageiro + " não pôde embarcar.");
        }
    }

    @Override
    public void desembarcarPassageiro(String nomePassageiro) {
        if (passageiros.contains(nomePassageiro)) {
            passageiros.remove(nomePassageiro);
            System.out.println(nomePassageiro + " desembarcou do metrô.");
        } else {
            System.out.println(nomePassageiro + " não está no metrô.");
        }
    }
}

interface FabricaTransporte {
    Transporte criarTransporte();
}

class FabricaOnibus implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Onibus(60, "Dinheiro", "A - B");
    }
}

class FabricaMetro implements FabricaTransporte {
    @Override
    public Transporte criarTransporte() {
        return new Metro(300, 50, "Linha Vermelha");
    }
}

public class Principal {
    public static void main(String[] args) {
        FabricaTransporte fabricaOnibus = new FabricaOnibus();
        Transporte onibus = fabricaOnibus.criarTransporte();
        System.out.println("Informações do Ônibus:");
        onibus.exibirInformacoes();
        System.out.println();

        FabricaTransporte fabricaMetro = new FabricaMetro();
        Transporte metro = fabricaMetro.criarTransporte();
        System.out.println("Informações do Metrô:");
        metro.exibirInformacoes();
        System.out.println();

        System.out.println("Gestão de Passageiros:");
        onibus.embarcarPassageiro("Felipe");
        onibus.embarcarPassageiro("John Kennedy");
        metro.embarcarPassageiro("German Cano");
        metro.embarcarPassageiro("David");

        System.out.println();
        onibus.desembarcarPassageiro("Nathany");
        metro.desembarcarPassageiro("Otavio");
        onibus.embarcarPassageiro("Eve");
        metro.embarcarPassageiro("Tatyele");
    }
}