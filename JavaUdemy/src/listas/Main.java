package listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.add("Danilo");
        list.add("Maria");
        list.add("Eduardo");
        list.add("Matheus");


    for(String x: list){
        System.out.println(x);
    }
    }
}
