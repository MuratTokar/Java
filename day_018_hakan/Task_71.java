package day_018_hakan;

public class Task_71 {

    // feet ve inch i argument olarak kabul eden bir method
    // inch i argument olarak kabul eden ayni isimde bir method
    // girilen inch i feet ve inch olarak hesaplayip, feet ve inch i kabul eden method a göndererek
    // sonucu hesaplatan program

    public static void main(String[] args) {
        feetVeInchToSantimetreCevir(6,0);
        feetVeInchToSantimetreCevir(-10,0);
        feetVeInchToSantimetreCevir(0,1);

        feetVeInchToSantimetreCevir(100);
        feetVeInchToSantimetreCevir(156);

    }

    public static double feetVeInchToSantimetreCevir(double feet, double inch){
        if(!(0 <= feet && 0 <= inch && inch <= 12)){
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double newInch = inch + feet*12;
        double santiMetre = 2.54*newInch;

        System.out.println(feet + " feets, " + inch + " inches = " + santiMetre + " cm.");

        return 0;
    }

    public static double feetVeInchToSantimetreCevir(double inch){
        if(0 > inch){
            System.out.println("Invalid inches");
            return -1;
        }
        double newInch = inch%12;
        double feet = (inch-newInch)/12;
        System.out.println(inch + " inches = " + feet + " feets and " + newInch + " inches");
        // feet ve inch gönderilerek,
        // sonucun diger method ta hesaplanip basilmasi icin,
        // feet ve inch degerlerini diger method a gönderiyoruz
        feetVeInchToSantimetreCevir(feet, newInch);
        return 0;

    }
}
