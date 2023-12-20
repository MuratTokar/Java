package day_011_hakan;

public class Task_32 {
    public static void main(String[] args) {
        //int a= 10, b = 15, c = 20;
        //int a= 15, b = 10, c = 20;
        int a= 10, b = 15, c = 20;
        //int a= 20, b = 15, c = 10;
        //int a= 10, b = 15, c = 20;
        //int a= 10, b = 20, c = 15;
        // a,b,c 3,2,1  6 test data

        if(b < a && c < a){
            System.out.println("En büyük sayi : " + a );
        } else if(a < b && c < b){
            System.out.println("En büyük sayi : " + b );
        } else {
            System.out.println("En büyük sayi : " + c );
        }

        if(b < a){ //   c1   b    c2    a    c3
            if(c < a){
                System.out.println("En büyük sayi : " + a );
            } else {
                System.out.println("En büyük sayi : " + c );
            }
        } else if(c < b) { //   c1   a    c2    b    c3
            System.out.println("En büyük sayi : " + b );
        }  else {
            System.out.println("En büyük sayi : " + c );
        }


        int max2Compare = Math.max(a,b);
        int max = Math.max(max2Compare,c);
        System.out.println("En büyük sayi : " + max);
    }
}
