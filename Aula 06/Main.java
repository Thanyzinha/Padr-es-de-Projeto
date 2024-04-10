import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Violao> fabricaVioloes = new HashMap<>();

        fabricaVioloes.put("classico", new ViolaoClassico());
        fabricaVioloes.put("folk", new ViolaoFolk());
        // Adicione outras classes conforme necessário

        // Cliente escolhe um tipo de violão (por exemplo, "folk")
        String tipoViolaoEscolhido = "folk";
        
        try {
            Violao prototipo = fabricaVioloes.get(tipoViolaoEscolhido);
            if (prototipo != null) {
                Violao novoViolao = (Violao) prototipo.clone();

                // Exemplo de saída com informações do novo violão criado
                System.out.println("Novo violão criado:");
                System.out.println("Modelo: " + novoViolao.getModelo());
                System.out.println("Cordas: " + novoViolao.getCordas());
                System.out.println("Tipo de Construção: " + novoViolao.getTipoConstrucao());
                System.out.println("Indicação: " + novoViolao.getIndicacao());
            } else {
                System.out.println("Tipo de violão não encontrado na fábrica.");
            }
        } catch (CloneNotSupportedException e) {
            System.out.println("Erro ao clonar o objeto: " + e.getMessage());
        }
    }
}
