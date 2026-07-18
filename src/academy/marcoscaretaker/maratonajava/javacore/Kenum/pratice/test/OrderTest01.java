package academy.marcoscaretaker.maratonajava.javacore.Kenum.pratice.test;

import academy.marcoscaretaker.maratonajava.javacore.Kenum.pratice.domain.Order;
import academy.marcoscaretaker.maratonajava.javacore.Kenum.pratice.domain.OrderStatus;

public class OrderTest01 {
    public static void main(String[] args) {
        Order order = new Order(1001);
        order.exibirResumo();
        order.setAtualizarStatus(OrderStatus.PROCESSANDO);
        order.exibirResumo();
    }
}
