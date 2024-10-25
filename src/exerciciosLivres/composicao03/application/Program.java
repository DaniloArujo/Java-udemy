package exerciciosLivres.composicao03.application;

import exerciciosLivres.composicao03.entities.Client;
import exerciciosLivres.composicao03.entities.Order;
import exerciciosLivres.composicao03.entities.OrderItem;
import exerciciosLivres.composicao03.entities.Product;
import exerciciosLivres.composicao03.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Product p = new Product("TV",1000.00);
        Product p2 = new Product("mouse",40.00);

        OrderItem oi1 = new OrderItem(1,1000.0,p);
        OrderItem oi2 = new OrderItem(1,40.0,p2);


        System.out.println(oi1);

        Client client = new Client("Danilo","daniloaraujomota@gmail.com",sdf.parse("05/07/1994"));
        System.out.println(client);

        Order order1 = new Order(sdf.parse("08/08/1994"), OrderStatus.valueOf("PROCESSING"),client);
        order1.addItem(oi1);
        order1.addItem(oi1);
        order1.addItem(oi2);


        System.out.println("---------------------");
        System.out.println(order1);
    }

}