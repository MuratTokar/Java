package day_064_mrt;

public class C055 {
    public static void main(String[] args) {
        int x = 5;  //x in degeri ancak while icinde degisebilir ama allttaki metot local oldugu icin x in degeri burda degismez
        //priimitive data type lerde degismez ama non primitive gibi referans degeri degisecek bir islem yapilinca degisir
        while (isAvailable(x)) {
            System.out.println(x);
            x--;  // x-- yapmasak surekli 5 i basacak
            // 5,4,3,2,1
        }
    }

    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;// x sifirdan buyukse devam et ama 1 azalt yani once sifirla kiyasla sonra azalt

        // hangi modifikation ile 54321 yazilabilir?
        // CEVAP=9 satira x-- yazariz
    }
}