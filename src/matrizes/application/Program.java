package matrizes.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter with the number of lines of array: ");
        int arraySize = scanner.nextInt();

        int[][] mat = new int[arraySize][arraySize];

        for(int x = 0; x < arraySize; x++){
            for(int y = 0; y < arraySize; y++){
                System.out.print("Enter with the number: ");
                mat[x][y] = scanner.nextInt();
            };
            System.out.println();
        };

        for(int x = 0; x < arraySize; x++){
            for(int y = 0; y < arraySize; y++){
                System.out.print(mat[x][y]+ " ");
            };
            System.out.println();
        };

        System.out.println("\n-------------------");
        //diagonal

        for(int x = 0; x < arraySize; x++){
            System.out.print(mat[x][x]+ " ");
        };


        System.out.println("\n-------------------");

        for(int x = 0; x < arraySize; x++){
            for(int y = 0; y < arraySize; y++){
                if(mat[x][y] < 0){
                    System.out.print(mat[x][y]+ " ");
                };
            };
        };

        scanner.close();
    }
}
