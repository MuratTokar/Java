package day_068_mrt;

public class C155 {
    public static void main(String[] args) {

        int wd = 0;
        String days[] = {"sun", "mon", "wed", "sat"};
        for (String s : days) {
            switch (s) {
                case "sat":    //-1
                case "sun":   // -1
                    wd -= 1;
                    break;
                case "mon":  //+1
                    wd++;
                case "wed": // +2  +2
                    wd += 2;
            }
        }
        System.out.println(wd);
    } // Cevap = A (3)-----  -1 , -1 ,+1 , +2 , +2
}

