package day_029_hakan.lab;

public class Q26 {
    /**
     * Bir arrayin ard arda 3 cift veya 3 tek sayi icerip icermedigini kontrol eden
     * bir method yaziniz
     */

    public static void main(String[] args) {
//        int x[] = {2,1,3,5}; // true
//        int x[] = {2,1,2,5}; // false
//        int x[] = {2,4,2,5}; // true
        int x[] = {2,4,3,5};  // false

        checkOddEvenNumbers(x);
    }

    public static void checkOddEvenNumbers(int[] numbers){
        // i=0 i+1 i+2
        boolean flag=false;
        for(int i = 0; i < numbers.length - 2 ; i++){
            if(numbers[i]%2 == 0){
                // i+1 ve i+2 even(cift) kontrolu
                if(numbers[i+1]%2==0 && numbers[i+2]%2==0){
                    flag=true;
                    break;
                }
            } else {
                // i+1 ve i+2 odd(tek) kontrolu
                if(numbers[i+1]%2 != 0 && numbers[i+2]%2 != 0){
                    flag=true;
                    break;
                }
            }
        }

        System.out.println(flag);
    }
}
