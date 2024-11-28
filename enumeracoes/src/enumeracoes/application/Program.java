package enumeracoes.application;

import enumeracoes.entities.Order;
import enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus status = OrderStatus.PENDING_PAYMENT;

        OrderStatus status1 = OrderStatus.valueOf("PENDING_PAYMENT");

        System.out.println(status);
        System.out.println(status1);
    }
}
