package enumeracoes.application;

import enumeracoes.entities.Order;
import enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order1 = new Order(12,new Date(), OrderStatus.DELIVERED);

        System.out.println(order1);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);


    }
}
