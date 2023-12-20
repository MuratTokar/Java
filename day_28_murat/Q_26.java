package day_28_murat;

public class Q_26 {
    public static void main(String[] args) {
        // bir Arrayin Ard arda 3 cift veya 3 tek sayi icerip icermedigini kontrol eden bir metoto yazin
       // int x[] = {2,1,3,5}; //true
        //int x[] = {2,1,2,5}; //false
        int x[] = {2,4,2,5}; //true

        checkOddEvenNumbers(x);
    }
    public static void checkOddEvenNumbers (int[] numbrs){
        boolean falg=false;
        //i,i+1,i+2
        for (int i = 0; i < numbrs.length-2; i++) {
            if (numbrs[i]%2==0) {
                //i+1 ve i+2 cift  kontrolu
                if (numbrs[i + 1] % 2 == 0 && numbrs[i + 2] % 2 == 0) {
                    falg = true;
                    break;
                } else {
                    if (numbrs[i + 1] % 2 != 0 && numbrs[i + 2] % 2 != 0) {
                        //i+1 ve i+2 tek  kontrolu
                        falg = true;
                    }

                }
            }

            



        }
        System.out.println(falg);
    }
}
