public class Main {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAOImpl();

        clienteDAO.addCliente(new Cliente("João Silva", "Rua A, 123", "1234-5678"));
        clienteDAO.addCliente(new Cliente("Maria Oliveira", "Rua B, 456", "8765-4321"));

        System.out.println("Todos os clientes:");
        for (Cliente cliente : clienteDAO.getAllClientes()) {
            System.out.println(cliente);
        }

        Cliente cliente = clienteDAO.getCliente("João Silva");
        if (cliente != null) {
            cliente.setEndereco("Rua C, 789");
            clienteDAO.updateCliente(cliente);
        }

        System.out.println("\nCliente atualizado:");
        System.out.println(clienteDAO.getCliente("João Silva"));

        clienteDAO.deleteCliente("Maria Oliveira");

        System.out.println("\nTodos os clientes após remoção:");
        for (Cliente c : clienteDAO.getAllClientes()) {
            System.out.println(c);
        }
    }
}
