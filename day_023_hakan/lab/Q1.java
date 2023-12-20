package day_023_hakan.lab;

import java.util.Scanner;

public class Q1 {

    /**
     * Verilen bir string in palindrome olup olmadigini control eden program yaziniz.
     * a. StringBuilder class I kullanarak yaziniz.
     * b. String Class I kullanarak yaziniz. Input : “MerreM” Output : true Input : “MeryeM” Output : false
     *
     */

    public static void main(String[] args) {
        // Solution a
        StringBuilder str1 = new StringBuilder("MerreM");
        String str1Original = str1.toString();
        String str1Reversed = str1.reverse().toString();
        System.out.println(str1Reversed.equals(str1Original)); // true

        StringBuilder str2 = new StringBuilder("MeryeM");
        String str2Original = str2.toString();
        String str2Reversed = str2.reverse().toString();
        System.out.println(str2Reversed.equals(str2Original)); // false

        // Solution b
        //String word = "MerreM"; // true
        String word = "MeryeM"; // false
        boolean isPalindrome = true;
        for(int i = 0; i < word.length(); i++){
            char c1 = word.charAt(i);
            char c2 = word.charAt( word.length()-1-i);
            if(!(c1 == c2)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
