package day_038_OOP.parkmetre;

public class Runner {
    public static void main(String[] args) {


        DijitalParkmetre parkmetre = new DijitalParkmetre(60); // Max süre: 60 dakika

        // Parkmetreyi kontrol etme örneği


        parkmetre.sureyiKontrolEt();
        // parkmetre.sureyiKontrolEt();
        // parkmetre.sureyiKontrolEt();

        // Yeni bilet alma örneği

        parkmetre.yeniBiletAl(30); // 30 dakika ek süre
        // parkmetre.sureyiKontrolEt();
        // parkmetre.sureyiKontrolEt();
    }
}
