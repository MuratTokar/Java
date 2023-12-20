package day_010_murat;

public class Anders {
    public static void main(String[] args) {
        // 0-12 arasi:good morning
        //12-15 arasi:good afternon
        // 15-24 arasi:good evening
        int saat=19;
        if (saat<12){
            System.out.println("good morning");
        }
        if (saat>= 12 && saat<15)
        {
            System.out.println("goof afternon");
        }
        if (saat>=15)
            System.out.println("good evening");

    }
}
