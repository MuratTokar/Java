package day_010_hakan;

public class Task_25 {

    public static void main(String[] args) {
        int a=5, b= 10, c = 8;
        //  a ile b yi kiyasla, büyük olani c ile kiyasla
        if(a>b && a>c)
            System.out.println("En büyük sayimiz : " + a);

        if(b>a && b>c)
            System.out.println("En büyük sayimiz : " + b);

        if(c>a && c>b)
            System.out.println("En büyük sayimiz : " + c);


        // 2. Cozum
        int enBüyükSayi=0;

        if(a>b && a>c)
          enBüyükSayi = a;

        if(b>a && b>c)
            enBüyükSayi = b;

        if(c>a && c>b)
            enBüyükSayi = c;

        System.out.println("En büyük sayimiz : " + enBüyükSayi);

        // 3. Cözüm
        int enBüyükSayi2=c;

        if(a>b && a>c)
            enBüyükSayi2 = a;

        if(b>a && b>c)
            enBüyükSayi2 = b;

        System.out.println("En büyük sayimiz : " + enBüyükSayi2);

    }
}
