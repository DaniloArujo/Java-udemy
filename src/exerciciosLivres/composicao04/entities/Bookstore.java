package exerciciosLivres.composicao04.entities;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {

    private String name;
    private List<Book> books = new ArrayList<>();

    public Bookstore(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void listBooks(){
        for(Book book : books){
            System.out.println(book.toString());
        }
    }


}
