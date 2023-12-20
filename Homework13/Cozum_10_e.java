package Homework13;

public class Cozum_10_e {
    public static void main(String[] args) {
      /*  int input=8;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=4; j++) {
                System.out.print(" G  S ");

            }
            System.out.println(" ");
        }*/

        int input=8;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=input; j++) {
                if ((i+j)%2==0){// i+j nin toplami cift ise T yazdiracak
                    System.out.print("T ");

                }else { // i+j nin tek ise o durumda s yazdiracak
                    System.out.print("S ");
                }

            }
            System.out.println(" ");
        }
    }
}
