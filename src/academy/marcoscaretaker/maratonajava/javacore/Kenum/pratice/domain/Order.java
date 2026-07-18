package academy.marcoscaretaker.maratonajava.javacore.Kenum.pratice.domain;

public class Order {
    private int numeroPedido;
    private OrderStatus status;

    public Order(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.status = OrderStatus.AGUARDANDO_PAGAMENTO;
    }

    public void exibirResumo(){
        System.out.println("Número do pedido: "+numeroPedido);
        System.out.println("Status do pedido: "+status);
    }

    public void setAtualizarStatus(OrderStatus newStatus){
            this.status = newStatus;
    }
}
