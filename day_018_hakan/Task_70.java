package day_018_hakan;

public class Task_70 {

    // skorSeviyesiniGöster(name,skorSeviyesi) -> print "$name, $skorSeviyesi skor seviyesindedir."
    // skorSeviyesiniHesapla(skor) -> return skorSeviyesi

    public static void main(String[] args) {
        String playerName = "Mike";
        int skor= 50; // 1500, 900, 400, 50
        int skorSeviyesi = skorSeviyesiniHesapla(skor);
        skorSeviyesiniGoster(playerName,skorSeviyesi );

    }

    public static void skorSeviyesiniGoster(String name, int skorSeviyesi){
        System.out.println(name + ", " + skorSeviyesi + " skor seviyesine sahiptir.");
    }

    public static int skorSeviyesiniHesapla(int skor){
        int skorSeviyesi;

        if(1000 <= skor){
            skorSeviyesi = 1;
        } else if (500 <= skor){
            skorSeviyesi = 2;
        } else if(100 <= skor){
            skorSeviyesi = 3;
        } else {
            skorSeviyesi = 4;
        }

        return skorSeviyesi;
    }
}
