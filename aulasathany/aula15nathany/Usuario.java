import java.util.HashSet;
import java.util.Set;

public class Usuario implements Observador {
    private String nome;
    private Set<String> generosInteressados = new HashSet<>();

    public Usuario(String nome, Set<String> generosInteressados) {
        this.nome = nome;
        this.generosInteressados = generosInteressados;
    }

    public void atualizar(String filme, String genero) {
        if (generosInteressados.contains(genero)) {
            System.out.println(nome + " recebeu uma notificação: Novo filme/série '" + filme + "' no gênero " + genero);
        }
    }
}
