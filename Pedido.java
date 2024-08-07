import java.time.LocalDate;

public class Pedido {
    private String id;
    private String idCliente;
    private LocalDate dataPedido;
    private double valorTotal;

    public Pedido(String id, String idCliente, LocalDate dataPedido, double valorTotal) {
        this.id = id;
        this.idCliente = idCliente;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getIdCliente() { return idCliente; }
    public void setIdCliente(String idCliente) { this.idCliente = idCliente; }
    public LocalDate getDataPedido() { return dataPedido; }
    public void setDataPedido(LocalDate dataPedido) { this.dataPedido = dataPedido; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", idCliente='" + idCliente + '\'' +
                ", dataPedido=" + dataPedido +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
