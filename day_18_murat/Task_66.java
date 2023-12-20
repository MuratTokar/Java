package day_18_murat;

public class Task_66 {
    public static void main(String[] args) {

        // Yol = hiz * zaman
        // yolu dönen "yoluHesapla" isminde bir metod yaziniz
        // arguments : hiz, zaman
        int gidilenYol=yoluHesapla(80,2);
        System.out.println("Gidilen yol :" + gidilenYol );

    }
    public static int yoluHesapla(int hiz,int zaman){
        return hiz*zaman;


    }
}
