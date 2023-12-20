package day_070_hakan;

public class Q_195 {
    public static void main(String[] args) {
        String shirts [][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

        for(String[] s : shirts){
            for(String elem : s){
                System.out.println(elem);
            }
        }

        // insert code
    }
}
// red: blue: small: medium: