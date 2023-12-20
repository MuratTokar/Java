package day_064_hakan;

public class Q53 {
    public static void main(String[] args) {
        int[][] num = new int[1][3]; // {{1,2,3}}
        for(int i= 0; i< num.length ; i++ ){ // i = 0
            for(int j=0; j < num[i].length; j++){ // 0, 1, 2
                num[i][j]=10;
                // num[0][0] = 10;
                // num[0][1] = 10;
                // num[0][2] = 10;
            }
        }
    }
}
// { {A}, {B}, {C} } num.lenth = 3
// num[i].length A.length || B.length || C.length
