package day_070_mrt;

public class C218 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");

        // line n1// buraya ne yazilmali ki "Equal" bassin
        if (str2.equals(str1.toLowerCase())) // bu  kod yazar
        {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    } // Cevap=B (if (str2.equals(str1.toLowerCase()))
}
