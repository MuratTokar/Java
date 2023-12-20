package homework12;

public class Cozum_4 {
    public enum Aylar{Ocak,Subat,Mart,Nisan,Mayis,Haziran,Temmuz,Agustos,Eylul,Ekim,Kasim,Aralik}
    public static void main(String[] args) {
        /*
        Girilen Ay’in kac gün cektigini gösteren programi yaziniz.
Input : Nisan Output : 30
         */
        //subat:28,yada 29----nisan,haziran,eylul ve kasim=30
        //1 yol
       /* String ay="ocak";
        switch (ay){
            case "Subat":
                System.out.println("28 ve 29 gün");
                break;
            case "Nisan":
            case "Haziran":
            case "Eylül":
            case "Kasim":
                System.out.println(" 30 gün");
            break;
            default:
                System.out.println("31 gün");
        }
*/

// 2. cozum


        Aylar aylar=Aylar.Eylul;

        switch (aylar){
            case Subat:
                System.out.println("28 veya 29 gun");
                break;
            case Nisan:
            case Haziran:
            case Eylul:
            case Kasim:
                System.out.println("30 gun");
                break;
            default:
                System.out.println("31 gun");
        }


    }
}
