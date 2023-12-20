package day_038_OOP.yakitDeposu;

public class Runner {


    public static void main(String[] args) {


        YakitDeposu yakitDeposu = new YakitDeposu(100, 0.05); // Max hacim: 100, km başına yakıt: 0.05

        System.out.println("Depo bos mu? " + yakitDeposu.depoBosMu());
        System.out.println("Depo full mu? " + yakitDeposu.depoFullMu());

        yakitDeposu.depoDoldur(50);
        System.out.println("Depo doluluk yuzdesi: " + yakitDeposu.depoDolulukYuzdesi() + "%");

        yakitDeposu.depoBosalt(100);
        System.out.println("Depo doluluk yuzdesi: " + yakitDeposu.depoDolulukYuzdesi() + "%");
    }
}
