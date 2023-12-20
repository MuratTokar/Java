package day_24_murat.lab;

public class Q1 {
    public static void main(String[] args) {
        // Bir method yazin.Bir array i kabul etsin eger array  da ilk eleman veya son eleman 6 ise True dönsün yoksa fallse dönsün
        //int[] numms={1,3,5}; // false
       //int[] numms={1,3,6}; // true
       //int[] numms={6,3,8}; // true
        //int[] numms={6,3,6}; // true
        int[] numms={2,3,16};// false
        //int[] numms={2,6,16};// false
        checkSix(numms); // methodu cagirdik
        System.out.println(checkSix(numms));// methodu yazdirdik

    }
    public static boolean checkSix(int[] numms){// methoud olusturduk
       return numms[0]==6 || numms[numms.length-1]==6;// for döngüsüne gerek olmadan karsilastirdik ve return ettik

    }

}
