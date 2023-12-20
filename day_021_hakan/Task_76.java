package day_021_hakan;

public class Task_76 {

    public static void main(String[] args) {
        String str = "Guider Soft";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));

        System.out.println("**********************************");
        // !!! i <= str.length() -> indexOutOfBoundException verir
        // !!! int i = 0  dan baslamali -> ilk karakterin index i 0 dir.
        for(int i=0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

    }
}
