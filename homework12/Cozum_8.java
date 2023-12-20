package homework12;

public class Cozum_8 {
    public static void main(String[] args) {
        /*
        8. Verilen bir sayinin pozitif, negative veya ‘0’ mi oldugunu veren programi yaziniz.
NOT : Ic ice switch-case kullanilabilir.
Input : 10 Output : 10 pozitif bir sayidir.
Input : -2 Output : -2 negatif bir sayidir.
Input : 0 Output : 0 sifirdir.
         */

int a=0;
/*
1.Yol

    switch (a){
        case 0:
            System.out.println(a + " Sifirdir "); break;
        default:{
            if (a>0){
                System.out.println(a + " Pozitifdir");
            } else {
                System.out.println(a+ " negatifdir");
            }
        }
    }

 */
/* 2. Yol

        switch (a){
            case 0:
                System.out.println(a + " Sifirdir "); break;
            default:{
                switch (Integer.signum(a)){
                    case 1:
                        System.out.println(a+ " Pozitifdir");
                        break;
                    default:{
                        System.out.println(a+ " Negatifdir");
                            }
 */


// 3. yol

        switch (Integer.signum(a)) {
            case 1: {
                System.out.println("Pozitif");
            }
            break;
            case -1: {
                System.out.println("Negatif");
            }
            break;
            default: {
                System.out.println(" Sifir");
            }
        }

    }
}
