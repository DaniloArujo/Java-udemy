package FuncStrings;

public class Split {
    public static void main(String[] args) {
        //Separa a string em um vetor com base no char indicado
        String original = "abcde EFGHI ABC abc DEFG      ";

        String[] vect = original.split(" ");
        
        for(int loop = 0; loop < vect.length; loop++){
            System.out.println(vect[loop]);
        }



    }
}
