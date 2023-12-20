package day_068_hakan;

public class Q141 {
    public static void main(String[] args) {
        String names[] = {"Thomas", "Peter","Joseph"};
        String pwd[] = new String[3];
        int idx =0;
        try {
            for(String n: names){
                pwd[idx] = n.substring(2,6); // Peter icin exception
                System.out.println(pwd[idx]); // omas
                idx++;
            }
        } catch(Exception e){
            System.out.println("Invalid Name");
        }
    }
}
