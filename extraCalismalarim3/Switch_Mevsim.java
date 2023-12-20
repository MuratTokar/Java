package extraCalismalarim3;

import java.util.Scanner;

public class Switch_Mevsim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir ay numarsi girin");
        int numara = scan.nextInt();


        switch (numara){
            case 12:

            case 1:

            case 2:
                System.out.println("Kis");
                break;
            case 3:

            case 4:

            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:

            case 7:

            case 8:
                System.out.println("yaz");
                break;
            case 9:

            case 10:

            case 11:

            default:
                System.out.println("gecerli bir numara girn");


        }
    }
}
