package FuncStrings;

public class Replace {
    public static void main(String[] args) {
        String original = "abcde EFGHI ABC abc DEFG      ";
        String replaced = original.replace("a", "x");
        String replaced2 = original.replace("abc", "x");


        System.out.println(original);
        System.out.println(replaced);
        System.out.println(replaced2);
    }
}
