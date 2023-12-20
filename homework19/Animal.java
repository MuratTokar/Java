package homework19;

public class Animal {// Soru:1/A

    // class main metod lu olmak zorunda degil.instance olunca main olmaz yani depo.main metodlu claas ile cagirilir.instance olunca static olmayacak
        boolean kanatliMi=true;             // fallse
        int ayakSayisi=12;    //
        String yasamAlani;// null

    public void getInfo(){  //2_a
        System.out.println(kanatliMi);
        System.out.println(ayakSayisi);
        System.out.println(yasamAlani);
    }

        public void eat() {// public umuma acik
            System.out.println("Yeniliyor");

        }

        public void fly() {
            System.out.println("uculuyor");


        }

        public void walk() {
            System.out.println("Yürüyor");


        }

        public void sleep() {
            System.out.println("uyuyor");

        }



        }




