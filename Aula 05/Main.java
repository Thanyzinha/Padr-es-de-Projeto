import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] times = {"Brasil", "Flamengo"};
        FabricaEsportiva[] fabricas = {new FabricaNike(), new FabricaAdidas()};

        for (int i = 0; i < times.length; i++) {
            System.out.println((i+1) + ". " + times[i]);
        }

        System.out.print("Escolha o time (1-" + times.length + "): ");
        int escolhaIndex = scanner.nextInt();

        if (escolhaIndex < 1 || escolhaIndex > times.length) {
            System.out.println("Escolha inválida.");
            System.exit(0);
        }

        FabricaEsportiva fabrica = fabricas[escolhaIndex - 1];

        CamisaEsportiva camisa = fabrica.criarCamisa();
        camisa.mostrarDetalhes();

        scanner.close();
    }
}
