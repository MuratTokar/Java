package day_070_mrt;

public class C195 {
    public static void main(String[] args) {
        String shirts [][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";

       /* for (int i = 0; i <shirts.length; i++) {  //1.yol
            for (int j = 0; j <shirts.length ; j++) {
                System.out.print(shirts[i][j] + " : ");

            }
            System.out.println();

        }*/

        for(String[] s : shirts){
            for(String elem : s){
                System.out.println(elem);
            }
        }
          //Which code fragment prints red: blue: small: medium ?

    }
}


