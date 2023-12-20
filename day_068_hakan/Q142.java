package day_068_hakan;

public class Q142 {
    public static void main(String[] args) {
        int wd = 0;
        String days[] = {"sun", "mon","wed","sat"};
        for(String s : days){
            switch(s){
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd -=1;
                    break;
                case "wed":
                    wd +=2;
            }
            System.out.println(" merhaba ");
        }
        System.out.println(wd);
    }
}
// -1
// -2
// 0
// -1
