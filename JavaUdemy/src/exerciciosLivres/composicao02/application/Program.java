package exerciciosLivres.composicao02.application;

import exerciciosLivres.composicao02.entities.Comment;
import exerciciosLivres.composicao02.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("HAve a nice trip!");
        Comment c2 = new Comment("wow thats awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to new zealand","I'm going to visit this wonderfull country");
        p1.setLikes(12);
        p1.addComent(c1);
        p1.addComent(c2);

    }
}
