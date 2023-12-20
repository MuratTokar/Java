package day_015_hakan.homework;

public class Q_02_c {

    public static void main(String[] args) {
        // fibonacci
        // 0  1  1  2  3  5
        int girilenSayi = 15 ;
        int ilkSayi = 0 ;
        int ikinciSayi = 1 ;
        int sonrakiSayi = 1;
        String sonuc = ilkSayi + "";
        do{
            sonuc = sonuc + ", " + ikinciSayi;
            sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;

        }
        while(ikinciSayi <= girilenSayi);

        System.out.println(sonuc);
    }
}

/*
ilkSayi        ikinciSayi         sonrakiSayi
0               1                   1
1               1                   2
1               2                   3
2               3                   5

*/
