package day_027_Exmpls;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class AL2 {
    /*
    2. Haftanin günlerini iceren bir ArrayList yaziniz. Girilen ay ve yilin ilk gününü bastiran
program yaziniz.
Input : Ay = 6, yil = 2023 Output : Persembe
     */
    public static void main(String[] args) {


        ArrayList<String> haftaninGunleri=new ArrayList<>();
        haftaninGunleri.add("Pazar");
        haftaninGunleri.add("Pazartesi");
        haftaninGunleri.add("Sali");
        haftaninGunleri.add("Carsamba");
        haftaninGunleri.add("Persembe");
        haftaninGunleri.add("Cuma");
        haftaninGunleri.add("Cumartesi");

        Scanner scanner=new Scanner(System.in);
        System.out.print("Ay; ");
        int ay=scanner.nextInt();
        System.out.print("Yil; ");
        int yil=scanner.nextInt();

        String output=ilkGunuBastir(ay, yil, haftaninGunleri);
        System.out.println(output);

    }

    private static String ilkGunuBastir(int ay, int yil, ArrayList<String> haftaninGunleri) {

        Calendar calendar=Calendar.getInstance();
        calendar.set(yil, ay-1,1);
        int gun=calendar.get(Calendar.DAY_OF_WEEK);
        return haftaninGunleri.get(gun-1);
    }
}
