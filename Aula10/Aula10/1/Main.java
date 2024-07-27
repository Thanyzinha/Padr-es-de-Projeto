import java.util.HashMap;
import java.util.Map;

public class Main {

    interface DatabaseAdapter {
        void connect();
        void disconnect();
        void executeQuery(String query);
    }
    public static void main(String[] args) {
        String userProfile = "Ultimate";
        Map<String, DatabaseAdapter> adapterMap = new HashMap<>();
        adapterMap.put("Gratuito", new DatabaseAdapter() {
            @Override
            public void connect() {
                System.out.println("Conectando ao Paradox...");
            }
            @Override
            public void disconnect() {
                System.out.println("Desconectando do Paradox...");
            }
            @Override
            public void executeQuery(String query) {
                System.out.println("Executando query no Paradox: " + query);
            }
        });
        adapterMap.put("Básico", new DatabaseAdapter() {
            @Override
            public void connect() {
                System.out.println("Conectando ao Firebird...");
            }
            @Override
            public void disconnect() {
                System.out.println("Desconectando do Firebird...");
            }
            @Override
            public void executeQuery(String query) {
                System.out.println("Executando query no Firebird: " + query);
            }
        });
        adapterMap.put("Ultimate", new DatabaseAdapter() {
            @Override
            public void connect() {
                System.out.println("Conectando ao MySQL...");
            }
            @Override
            public void disconnect() {
                System.out.println("Desconectando do MySQL...");
            }
            @Override
            public void executeQuery(String query) {
                System.out.println("Executando query no MySQL: " + query);
            }
        });
        DatabaseAdapter adapter = adapterMap.get(userProfile);
        if (adapter == null) {
            throw new IllegalArgumentException("Perfil de usuário desconhecido: " + userProfile);
        }
        adapter.connect();
        adapter.executeQuery("SELECT * FROM tabela");
        adapter.disconnect();
    }
}
