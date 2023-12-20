package day_057_hakan;

import java.util.Arrays;

public class Operators {

    public static void main(String[] args) {
        int num = 54321;
        String numStr = num + "";
        String[] numDigits = numStr.split("");
        System.out.println(Arrays.toString(numDigits));

        String newNumber="";
        int a = num;
        while(0<a){
            newNumber =+ a%10 +"";
            a /= 10;
        }

        if(newNumber.equals(num+"")){
            System.out.println("Palindrome");
        }

       // charAt ile for dongusunde uzunluk-1-i ile i .indexteki sayilari compare ederek
        String str2 = "12345";
        StringBuilder str = new StringBuilder(str2);
        String newStr = str.reverse().toString();
        System.out.println(str.reverse());

        if(str2.equals(newStr)){
            System.out.println("Palindrome");
        }

        int x = 5;
        int y = x++;
        System.out.println(x); // 6
        System.out.println(y); // 5

        int x1 = 5;
        int y1 = ++x1;
        System.out.println(x1); // 6
        System.out.println(y1); // 6

        var var1 = 5;
        var1 = var1 +1; // 6
        var1++; // 7
        var1 += 1 ; // 8

        int z = 25;
        System.out.println(z++); // 25
        System.out.println(z); // 26

        // x ^ y = x'y + xy'
        // true ^ false = true' && false || true && false' = true
        // false ^ true = false' && true || false && true' = true
        // true ^ true = true' && true || true && true' = false
        // false ^ false = false' && false || false && false' = false

        // a | b -> her ikisini de check eder
        // a || b -> soldaki true ise, sagdakine bakmadan true sonucunu verir, islem tasarrufu saglar

        // a & b -> her ikisini de check eder
        // a && b -> soldaki false ise, sagdakine bakmadan false sonucunu verir, islem tasarrufu saglar




    }
}
