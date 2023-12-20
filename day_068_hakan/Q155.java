package day_068_hakan;

public class Q155 {
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
                    wd++;
                case "wed":
                    wd +=2;
            }
        }
        System.out.println(wd);
    }
}
// wd = -1
// wd = 0
// wd = 2
// wd = 4
// wd = 3
