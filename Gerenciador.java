import java.util.HashMap;
import java.util.Map;

public class Gerenciador {
    private Map<String, Cliente> clientes;
    private Map<String, Pedido> pedidos;

    public Gerenciador() {
        clientes = new HashMap<>();
        pedidos = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
    }

    public void removerCliente(String id) {
        clientes.remove(id);
    }

    public Cliente buscarCliente(String id) {
        return clientes.get(id);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    public void removerPedido(String id) {
        pedidos.remove(id);
    }

    public Pedido buscarPedido(String id) {
        return pedidos.get(id);
    }

    @Override
    public String toString() {
        return "Gerenciador{" +
                "clientes=" + clientes.values() +
                ", pedidos=" + pedidos.values() +
                '}';
    }
}
