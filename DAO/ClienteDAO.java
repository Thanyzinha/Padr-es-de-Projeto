import java.util.List;

public interface ClienteDAO {
    void addCliente(Cliente cliente);
    Cliente getCliente(String nome);
    List<Cliente> getAllClientes();
    void updateCliente(Cliente cliente);
    void deleteCliente(String nome);
}
