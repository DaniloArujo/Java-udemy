package FuncStrings;

public class LastIndexOf {
    public static void main(String[] args) {
        String original = "abcde EFGHI ABC abc DEFG      ";
        int i = original.lastIndexOf("abc");

        System.out.println(i);
    }   
}
