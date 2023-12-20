package day_062_hakan;

public class Q22 {
    public static void main(String[] args) {
        int ans ; // ans ye deger atamadigimiz iicn burda hata verir
        try{
            int num = 10;
            int div = 0;
            ans = num/div;
        } catch(ArithmeticException ae){
            ans =0;
        } catch (Exception e){
            System.out.println("Invalid calculation");

        }
     // System.out.println("Answer = " + ans);
        // compilation fails// en ustte ans ye sifir degeri atasyadik burda compiler vermezdi


       // int k;

        if(true){
        //  k=1;
        } else if(false){
          //  k=2;
        } else {
         //   k=3;
        }
     //System.out.println(k);
    }
}
