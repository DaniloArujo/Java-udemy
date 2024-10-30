package exerciciosLivres.exercicioOOP01.entities;

public class Rectangle {

    public double width;
    public double height;


    public double area(){
        return width * height;
    }

    public double perimeter(){
        return (2 * width) + ( 2 * height);
    }

    public double diagonal(){
        return  Math.sqrt(Math.pow(width,2) + Math.pow(height, 2));
    }

    public String toString(){
        return String.format("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f",area(),perimeter(),diagonal());
    }
}