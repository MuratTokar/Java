package day_065_hakan;

public class Q78 {
}

class Equal {
    public static void main(String[] args) {
        String str1 = "Java";
        String str4 = "Java";
        String[] str2 = {"J","a","v","a"};
        String str3 = "";
        for(String str : str2){
            str3 = str3 + str;
           // str3 = str3.concat(str);
        }

        String str5 = str1;

        boolean b1 = str1.equals(str3); // true
        boolean b2 = str1==str3; // false
        boolean b3 = str1==str4; // true
        System.out.println(b1 + ", " + b2);
        System.out.println(b3); // true
        System.out.println(str1==str5); // true

        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6 + str7;
        System.out.println(str1 == str8);
    }
}
