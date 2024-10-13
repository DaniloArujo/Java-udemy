package enumeracoes.application;

import enumeracoes.entities.Order;
import enumeracoes.entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(12,new Date(), OrderStatus.DELIVERED);

        System.out.println(order);

    }
}
