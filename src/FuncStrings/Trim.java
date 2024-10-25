package FuncStrings;

public class Trim {
    public static void main(String[] args) {
        String original = "abcde EFGHI ABC abc DEFG      ";
        String trim = original.trim();

        System.out.println("##################################");
        System.out.println("-" + original + "-");
        System.out.println("-" + trim + "-");


    }
}
