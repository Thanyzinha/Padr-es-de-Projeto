public class ClienteController {
    private Cliente cliente;
    private ClienteView view;

    public ClienteController(Cliente cliente, ClienteView view) {
        this.cliente = cliente;
        this.view = view;
    }

    public void setNomeCliente(String nome) {
        cliente.setNome(nome);
    }

    public String getNomeCliente() {
        return cliente.getNome();
    }

    public void setEnderecoCliente(String endereco) {
        cliente.setEndereco(endereco);
    }

    public String getEnderecoCliente() {
        return cliente.getEndereco();
    }

    public void setTelefoneCliente(String telefone) {
        cliente.setTelefone(telefone);
    }

    public String getTelefoneCliente() {
        return cliente.getTelefone();
    }

    public void atualizarView() {
        view.mostrarDetalhesCliente(cliente.getNome(), cliente.getEndereco(), cliente.getTelefone());
    }
}
