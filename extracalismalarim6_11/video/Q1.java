package extracalismalarim6_11.video;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");
        int not= scan.nextInt();


        if (not<65){
           if (not>=50){
                System.out.println("Gecme Notunuz CC");
            }else {
                System.out.println("Gecme Notunuz DD");
            }

        } else if (not<=85&&not>=0) {
            System.out.println("gecme notunuz bb");

            }else {
            System.out.println("gecme notunuc cc");
        }




    }
}
