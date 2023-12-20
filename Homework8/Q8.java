package Homework8;

public class Q8 {
    public static void main(String[] args) {
        /*
    Verilen dakikayi, yil, ay ve güne ceviren programi yaziniz. (1 year = 12 months = 360 days, 1
month = 30 days varsayiniz)
Input = 3,425,202 minutes output = 6 years 7 months 8 days 14 hours 42 minutes
     */


            int input= 3425202;
            int artikDkk=input%60;
            int saat= (input - artikDkk)/60;
            int artikSaat=saat%24;
            int gün= (saat-artikSaat)/24;
            int artikGun= gün%30;
            int ay= (gün-artikGun)/30;  //  7
            int artikAy=ay%12;
            int yil= (ay - artikAy)/12;     // 6



            System.out.println(yil + " yil " + artikAy + " ay" + artikGun + " gün" + artikSaat + " saat " + artikDkk + " dakika " );
    }
}
