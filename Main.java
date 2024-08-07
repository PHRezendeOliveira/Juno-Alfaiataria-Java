import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        // Adicionar clientes
        Cliente cliente1 = new Cliente("1", "Maria Silva", "Rua A, 123", "1234-5678");
        Cliente cliente2 = new Cliente("2", "João Oliveira", "Rua B, 456", "8765-4321");

        gerenciador.adicionarCliente(cliente1);
        gerenciador.adicionarCliente(cliente2);

        // Adicionar pedidos
        Pedido pedido1 = new Pedido("1", "1", LocalDate.now(), 150.75);
        Pedido pedido2 = new Pedido("2", "2", LocalDate.now(), 200.00);

        gerenciador.adicionarPedido(pedido1);
        gerenciador.adicionarPedido(pedido2);

        // Exibir dados
        System.out.println("Clientes:");
        System.out.println(gerenciador.buscarCliente("1"));
        System.out.println(gerenciador.buscarCliente("2"));

        System.out.println("Pedidos:");
        System.out.println(gerenciador.buscarPedido("1"));
        System.out.println(gerenciador.buscarPedido("2"));

        // Exibir todos os dados
        System.out.println("Gerenciador:");
        System.out.println(gerenciador);
    }
}
