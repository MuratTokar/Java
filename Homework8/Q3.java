package Homework8;

public class Q3 {
    public static void main(String[] args) {


     /*
    3. Girilen 2 basamakli bir sayinin karesinin, 3 te birinin, 7 fazlasinin, 10 a bölümünden kalan
sayiyi hesaplayan programi yaziniz.
Input = 30 output = 7
     */
        int input=30;
        int output= ((input*input)/3+7)%10;

        System.out.println(output);

    }
}
