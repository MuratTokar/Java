package day_014_hakan;

public class Task_51 {
    public static void main(String[] args) {
        // saat : dakika : saniye seklinde yazdiran program
        // saat en dis loop
                // dakika loop
                            // saniye loop

        for(int saat=0; saat < 24; saat++){

            for(int dakika=0; dakika < 60; dakika++){

                for(int saniye=0; saniye < 60; saniye++){
                    //System.out.println(saat + " : " + dakika + " : " + saniye);
                    System.out.printf("\n%02d:%02d:%02d",saat ,dakika,saniye);
                }
            }
        }
    }
}
