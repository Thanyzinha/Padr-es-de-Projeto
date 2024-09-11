import java.util.ArrayList;
import java.util.List;

public class PlataformaDeVideo {
    private List<Observador> observadores = new ArrayList<>();
    private String filme;
    private String genero;

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(filme, genero);
        }
    }

    public void adicionarFilme(String filme, String genero) {
        this.filme = filme;
        this.genero = genero;
        notificarObservadores();
    }
}
