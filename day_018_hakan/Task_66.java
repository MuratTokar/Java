package day_018_hakan;

public class Task_66 {

    // Yol = hiz * zaman
    // yolu dönen "yoluHesapla" isminde bir metod yaziniz
    // arguments : hiz, zaman

    public static void main(String[] args) {
      int gidilenYol = yoluHesapla(80, 2);
        System.out.println("Gidilen Yol = " + gidilenYol + " km");
    }

    public static int yoluHesapla(int hiz,int zaman){
        return hiz*zaman;
    }
}
