package day_070_mrt;

public class C203 {
    public static void main(String[] args) {
        String myStr = "Hello World " ;
         myStr.trim(); // atama olmadigi icin ise yaramaz
        int i1 = myStr.indexOf(" ");
        System.out.println(i1); // 5
    }
}
// cevap= C(5)
