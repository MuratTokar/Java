package day_069_hakan;

public class Q180 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.substring(2);
        System.out.println(sb);
        sb.append(sb,2,4);
        System.out.println(sb);
        // reverse(), insert() & append() ustune yaziyor
        sb.insert(0,"Python");
        System.out.println(sb);
    }
}
