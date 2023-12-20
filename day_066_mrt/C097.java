package day_066_mrt;

public class C097 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java");
        String s="Java";
        if (sb.toString().equals(s.toString())){ // önce string e ceviriyor sb yi sonra karsilastiriyor.s icin toStringe gerek yok
            System.out.println("Match1");

        } else if (sb.equals(s)) {// StringBuilder bu sekilde object kabul eder ama farkli object turu olduklari icin fals döner
            System.out.println("Match 2");

        }else {
            System.out.println("No Match");
        }
    }// Match1 yazacak
}
