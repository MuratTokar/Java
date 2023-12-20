package day_065_mrt;

public class C069 {
    public static void main(String[] args) {
        String[][] chs=new String[5][2];// 5 tane array var ve her birinin uzunlugu 2 dir
        chs[0] = new String[2];
        chs[1] = new String[5];// burda 2.array i 5 elemanli yapti
        int i =97;

        for (int a = 0; a <chs.length ; a++) {// 5e kadar basacak
           // for (int b = 0; b <chs[a].length ; b++) {// chs[a] yaparsak sorun cozulur.hangi array ise a o olacak.a ne olursa o erayy in uzunlugu olur
            for (int b = 0; b <chs.length ; b++) {// ama b 0 , 1 i basar ama 2.de hata alir
                                                  // sorun verecek ve ikinci for a gecmeyecek
                chs[a][b]= " " + i;
                i++;

                //a=0  b=0
                //a=0  b=1
                //a=0  b=2
                // cevap=E:An arrayIndexOutOfBoundsException is thrown at runtime


            }

        }
        for (String[] ca:chs){
            for (String c : ca){
                System.out.println(c + " ");


            }
            System.out.println();
        }
    }
} // E= ArrayIndexOutOfBoundsException
