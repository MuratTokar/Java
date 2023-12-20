package homework12;

public class Cozum_7 {
    public static void main(String[] args) {
        /*
        7. Universite not sistemine göre girilen harfe göre, sonucu veren program yaziniz.
NOT : Harfler büyük ya da kücük girildiginde bile, program yine de calisiyor olmali.
A : Mükemmel
B : Cok iyi
C : Iyi
D : Idare eder
F : Basarisiz
Input : a Output : Mukemmel
Input : C Output : Iyi
         */
        char not='k';
        switch (not){
            case 'A':
            case 'a':
                System.out.println("Mükemmel");
                break;
            case 'B':
            case  'b':
                System.out.println("Cok iyi");
                break;
            case 'C':
            case 'c':
                System.out.println("Iyi");
                break;
            case 'D':
            case 'd':
                System.out.println("Idare eder");
                break;
            case 'F':
            case 'f':
                System.out.println("Basarisiz");
            default:
                System.out.println("Gecersiz not");
        }
    }
}
