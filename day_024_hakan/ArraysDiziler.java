package day_024_hakan;

public class ArraysDiziler {

    public static void main(String[] args) {
        /**  Arrays
         *
         * Belirli bir data type(int, double, char, String vs) ina sahip, belirli sayidaki
         * degiskenlerin bir araya gelerek olusturduklari sirali(index) data havuzlarina array denir.
         *
         * int[] agesOfStudents; // Array in uzunlugunu ya da degerlerini bastan vermemiz gerekir
         * agesOfStudents = {25,30,35,40,45};
         *
          */

        int[] agesOfStudents = new int[5];
         // agesOfStudents = new int[]{25, 30, 35, 40, 45};
        agesOfStudents[0] = 25;
        agesOfStudents[1] = 30;
        agesOfStudents[2] = 35;
        agesOfStudents[3] = 40;
        agesOfStudents[4] = 45;

        String[] nameOfStudents = new String[]{"Haldun","Zafer","Idris","Selvi","Turgut"};
        System.out.println(nameOfStudents[0]); // Haldun
        System.out.println(nameOfStudents[1]); // Zafer
        System.out.println(nameOfStudents[2]); // Idris
        System.out.println(nameOfStudents[3]); // Selvi
        System.out.println(nameOfStudents[4]); // Turgut

        System.out.println("************************************");

        for (int i = 0; i < 5; i++){
            System.out.println(nameOfStudents[i]);
        }

        System.out.println("************************************");

        int[] digits = new int[10];
        for(int i = 0; i < 10 ; i ++){
            digits[i] = i*5;
        }

        for (int i = 0; i < 10; i++){
            System.out.println(digits[i]);
        }

        System.out.println("************************************");

        int[] numbers = new int[10];
        for(int i = 0; i < 10 ; i ++){
            System.out.println(numbers[i]);
        }

        System.out.println("************************************");

        String[] words = new String[4];
        for(int i = 0; i < 4 ; i ++){
            System.out.println(words[i]);
        }

        System.out.println("************************************");

        int[] nums, nums2;
        nums = new int[4];
        System.out.println(nums[0]);

        int nums3[], nums4; // nums3 int arrayi iken, nums4 bir int variable
        // System.out.println(nums4);
        // System.out.println(nums3);

        System.out.println("************************************");

        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};

        int lengthOfMonthsArray = months.length;
        System.out.println(lengthOfMonthsArray);

        for (int i = 0; i < months.length ; i++){
            System.out.println((i+1) + ". ay : " + months[i]);
        }




    }
}
