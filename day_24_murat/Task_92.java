package day_24_murat;

public class Task_92 {
    public static void main(String[] args) {
        /**
         * 1-10 arasi sayilari iceren bir int array olusturun
         * Bu arrayin her bir elementini 19 ile carpin
         * Daha sonra array in elemanlarini tek tek yazdirin
         */
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            //numbers[i]=numbers[i]*19;
            numbers[i]*=19;


        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
