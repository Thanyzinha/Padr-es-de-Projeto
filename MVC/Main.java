public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "Rua A, 123", "1234-5678");

        ClienteView view = new ClienteView();

        ClienteController controller = new ClienteController(cliente, view);

        controller.atualizarView();

        controller.setNomeCliente("Maria Oliveira");
        controller.setEnderecoCliente("Rua B, 456");
        controller.setTelefoneCliente("8765-4321");

        controller.atualizarView();
    }
}
