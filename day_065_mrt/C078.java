package day_065_mrt;

public class C078 {
}

class Equal {
    public static void main(String[] args) {
        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        for (String str : str2) {
            str3 = str3 + str;
            // str3 = str3.concat(str);
        }


        boolean b1 = str1.equals(str3); // true
        boolean b2 = str1 == str3; // false
        System.out.println(b1 + ", " + b2);
        // Equals refensa bakmaz sadece degerleri karsilastirir ama == bu referansa bakar.


        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6 + str7;
        System.out.println(str1 == str8);// str1 ile str 8 in referansi farkli.Yni false olur
        System.out.println(str1.equals(str8));// ama burda degerler ayni ve True olur

        // Cevap =True,false:C
    }
}
