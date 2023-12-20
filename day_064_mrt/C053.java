package day_064_mrt;

public class C053 {
    public static void main(String[] args) {
        int num[][] =new int[1][3];// {A}={{a,b,c}}
        for (int i=0;i<num.length;i++){// i=0    num 1 dir
            for (int j=0; j<num[i].length;j++){ // num[i] dedigi icin uzunluk 3 yani 0 1 2
                num[i][j]=10;

                // num[0][0]=10
                // num[0][1]=10
                // num[0][2]=10
                // Cevap=A
            }
        }
    }
}
