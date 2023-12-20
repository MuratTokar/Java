package homework12;

public class Cozum_5 {
    public static void main(String[] args) {
        /*
        5. Bir kisinin oy kullanabilir olup olmadigini veren programi yaziniz.
Input : 20 Output : Oy kullanabilir.
Input : 17 Output : Oy kullanamaz.
         */

        int input = 20;
        switch (input) {
            case 20:
                if (input >= 18) {
                    System.out.println("Oy kullanabilir");
                }
                break;
            default:
                System.out.println("Oy kullanamz");
        }
    }
}
