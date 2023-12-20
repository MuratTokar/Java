package day_25_murat;

import java.util.Arrays;

public class ArraysDegisiklikleriKorur {
    public static void main(String[] args) {
        int[] nums={0,1,2,3};
        degerleriIkiArtir(nums);
        System.out.println(Arrays.toString(nums));

    }
    // Array aolayinca return yapmadan deger geri dönmez ama arryda döner
    public static void degerleriIkiArtir(int[] sayilar){ // return yapmadigimiz halde aldi.cunku Array da return olmasada degeri alir
        for (int i = 0; i <sayilar.length; i++) {
            sayilar[i]+=2;

        }

    }
}
