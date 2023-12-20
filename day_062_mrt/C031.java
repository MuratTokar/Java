package day_062_mrt;

public class C031 {
    public static void main(String[] args) {
        int array1[]={1,2,3};
        int array2[]=new int[5];
        array2=array1;
        for (int i:array2){
            System.out.println(i+ " ");//1,2,3
        }
        System.out.println();// enter
        int array3[]=new int[3];
        array3=array2;
        for (int i:array3){
            System.out.println(i+ " ");// 1,2,3
        }
    }
}
