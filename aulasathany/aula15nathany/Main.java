import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        PlataformaDeVideo plataforma = new PlataformaDeVideo();

        Set<String> generosUsuario1 = new HashSet<>();
        generosUsuario1.add("Ação");
        generosUsuario1.add("Comédia");

        Set<String> generosUsuario2 = new HashSet<>();
        generosUsuario2.add("Terror");
        generosUsuario2.add("Anime");

        Set<String> generosUsuario3 = new HashSet<>();
        generosUsuario3.add("Ficção Científica");

        Usuario usuario1 = new Usuario("João", generosUsuario1);
        Usuario usuario2 = new Usuario("Maria", generosUsuario2);
        Usuario usuario3 = new Usuario("Ana", generosUsuario3);
        Usuario usuario4 = new Usuario("Carlos", generosUsuario1);
        Usuario usuario5 = new Usuario("Luana", generosUsuario2);

        plataforma.adicionarObservador(usuario1);
        plataforma.adicionarObservador(usuario2);
        plataforma.adicionarObservador(usuario3);
        plataforma.adicionarObservador(usuario4);
        plataforma.adicionarObservador(usuario5);

        plataforma.adicionarFilme("O Grande Filme", "Ação");
        plataforma.adicionarFilme("O Mistério do Medo", "Terror");
        plataforma.adicionarFilme("O Futuro Incerto", "Ficção Científica");
    }
}
