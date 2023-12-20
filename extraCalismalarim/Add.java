package extraCalismalarim;

public class Add {
    public static void main(String[] args) {

        //int[] x = {1, 2, 1, 3};
        // int a = 2;

        int[] x = {1, 2, 1, 3};
        int a = 1;
        sayiTekrari(x,a);
    }
    public static void sayiTekrari(int[] nums,int a){
        // verilen array icerisinde  bir lelmanin en az iki defa bulunup bulunmadigini kontrol eden program
       int counter=0;
        for (int sayi:nums) {
            if (sayi==a ){
                counter++;
            }


            }

        System.out.println(counter>=2 );
    }
    }

