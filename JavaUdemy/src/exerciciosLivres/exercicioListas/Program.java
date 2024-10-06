package exerciciosLivres.exercicioListas;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Danilo");
        list.add("Alex");
        list.add("Matheus");
        list.add("Nicholas");
        list.add("Bob");
        list.add("Anna");

        for(String x : list){
            System.out.println(x);
        }

        list.add(2, "Marco");

        System.out.println("###################");
        for(String x : list){
            System.out.println(x);
        }
        System.out.println(list.size());

        list.remove("Anna");
 
        System.out.println("###################");
        for(String x : list){
            System.out.println(x);
        }
        System.out.println(list.size());
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("###################");
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("Index of bob: " + list.indexOf("Bob"));

    }
}
