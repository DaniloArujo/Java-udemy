package testeProcessamento;

import java.util.Scanner;

public class AreaTrapezio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um lado: ");
        double x = scanner.nextDouble();
        
        System.out.println("Entre com o outro lado: ");
        double y = scanner.nextDouble();


        System.out.println("Entre com a altura: ");
        double z = scanner.nextDouble();


        

        double area = ((x + y)/2 )* z;

        System.out.printf("A área do trapézio é de %.2f",area);

        scanner.close();
    }
}
