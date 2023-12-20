package homework12;

public class Cozum_3 {
    public static void main(String[] args) {
        /*
        3. Girilen sayinin cift mi tek mi oldugunu veren programi yaziniz.
        Input : 20 Output : Bu bir cift sayidir.
        Input : 25 Output : Bu bir tek sayidir.
         */
        int sayi=-3;
        switch (sayi%2){
            case 0:
                System.out.println(sayi + " bir cift sayidir");
                break;
            default:
                System.out.println(sayi + "  tek sayi");

        }
    }
}
