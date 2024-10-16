package exerciciosLivres.composicao04.application;

import exerciciosLivres.composicao04.entities.Author;
import exerciciosLivres.composicao04.entities.Book;
import exerciciosLivres.composicao04.entities.Bookstore;

public class Program {
    public static void main(String[] args) {
        // Creating authors
        Author author1 = new Author("George Orwell", "george@orwell.com");
        Author author2 = new Author("J.K. Rowling", "jk@rowling.com");

        // Creating books
        Book book1 = new Book("1984", author1, 39.90);
        Book book2 = new Book("Harry Potter", author2, 59.90);

        // Creating bookstore and adding books
        Bookstore bookstore = new Bookstore("Central Bookstore");
        bookstore.addBook(book1);
        bookstore.addBook(book2);

        // Listing books in the bookstore
        bookstore.listBooks();
    }
}
