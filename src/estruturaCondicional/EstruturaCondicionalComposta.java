package estruturaCondicional;

public class EstruturaCondicionalComposta {
    public static void main(String[] args) {
        int periodo = 14;

        if (periodo < 12){
            System.out.println("Bom dia!");
        }else if (periodo < 18) {
            System.out.println("Boa tarde!");
        }else{
            System.out.println("Boa noite!");
        }
    }
}
