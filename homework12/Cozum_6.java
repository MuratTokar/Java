package homework12;

public class Cozum_6 {
    public static void main(String[] args) {
        /*
        6. Girilen 3 farkli sayidan, ortadaki sayiyi veren program yaziniz.
Input : 15, 25, 40 Output : 25
Input : 10, 20, 13 Output : 13

         */
        int a=145,b=2500,c=40;

         // a<b<c  ve c<b<a  ====> b ortanca sayidir
        // a<c<b  ve b<c<a  ====> c ortanca sayidir
        // c<a<b  ve b<a<c  ====> a ortanca sayidir
switch (b){
    case 2500:if (a<b && b<c || c<b && b<a ){
        System.out.println("Ortanca sayi: " + b);
    } else if (a<c && c<a || b<c && c<a){
        System.out.println("Ortanca sayi: " +c);
    } else {
        System.out.println("Ortanca sayi: " + a);
    }
        break;

}

    }


}
