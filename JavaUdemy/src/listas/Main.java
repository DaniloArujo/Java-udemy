package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Danilo");
        list.add("Maria");
        list.add("Eduardo");
        list.add("Matheus");
        list.add("Anna");
        list.add("Souza");
        list.add("Marcela");
        list.add("Ana maria");
        list.add("Allex");

        
        list.add(2,"lucas");


        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());


        for(String x: list){
            System.out.println(x);
        }
        
        System.out.println();
        
        for(String x: result){
            System.out.println(x);
        }
        
        System.out.println("#################");


        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


        System.out.println("#################");
        
        list.remove(4);
        list.remove("Danilo");
        //list.removeIf(x -> x.charAt(0) == 'M');

        for(String x: list){
            System.out.println(x);
        }
        System.out.println("Index of Eduardo: " + list.indexOf("Eduardo"));
        System.out.println("Index of Marcos: " + list.indexOf("Marcos"));
        System.out.println(list.size());
    }
}
