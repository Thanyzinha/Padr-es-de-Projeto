import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAOImpl() {
        clientes = new ArrayList<>();
    }

    @Override
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente getCliente(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Cliente> getAllClientes() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        Cliente existingCliente = getCliente(cliente.getNome());
        if (existingCliente != null) {
            existingCliente.setEndereco(cliente.getEndereco());
            existingCliente.setTelefone(cliente.getTelefone());
        }
    }

    @Override
    public void deleteCliente(String nome) {
        Cliente cliente = getCliente(nome);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }
}
