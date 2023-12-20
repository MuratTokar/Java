package day_061_hakan;

public class Q14 {
    public static void main(String[] args) {
        String str = "Sweat Sweat";
        String str2 = str.trim().charAt(6) + "" + str.indexOf("Sw",1);// burdaki 1 ;1.index ten sonra ara
                                                                                      // ilk S den sonra ki S 6.index tedir
        System.out.println(str2);
    }
}

// S + "" + 6
// S6
