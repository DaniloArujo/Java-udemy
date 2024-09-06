package forEach;

public class Program {
    public static void main(String[] args) {
        String[] vect = new String[]{"Danilo","Eduardo","Matheus","carlos"};


        // for(int i = 0; i < vect.length; i++){
        //     System.err.println(vect[i]);
        // }

        for(String obj : vect){
            System.out.println(obj);
        }

    }
}
