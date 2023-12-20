package day_065_hakan;

public class Q90 {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 =(long)  s1 + s2;       // line n1
       // String s4 = (String) (s3 * s2);        // line n2
        String s4 =  (s3 * s2) + "";        // line n2
         System.out.println("Sum is : " + s4);
    }
}
// among wrapper classes can not be converted to each other by casting.