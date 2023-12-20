package day_25_murat;

import java.util.Arrays;

public class Arrays_Diziler_2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,};
        System.out.println(nums);// [I@15aeb7ab  referans numarsi basar
        System.out.println("nums :" + Arrays.toString(nums));// dizi listesini basti

        int[] numsCopy= Arrays.copyOf(nums,4);// [I@7b23ec81  rferans degeri
        System.out.println(numsCopy);
        System.out.println("NumsCopy : " + Arrays.toString(numsCopy));// dizi listesini basti

        int[] nums2=nums;
        System.out.println(nums); // [I@15aeb7ab
        System.out.println(" Nums2 : " + Arrays.toString(nums2));

        nums[0]=40;// yeni deger atadik ilk endexe
        System.out.println("Deger degisikliginden sonra");

        System.out.println("Nums :" + Arrays.toString(nums));

        System.out.println("NumsCopy: " + Arrays.toString(numsCopy));// yukarida degeri copyaladigimiz icin deger degismedi.
                                                                      // kalanlara 40 atadi

        System.out.println("Nums2: " + Arrays.toString(nums2));
        System.out.println("###########################################################################");

        int[] numsort={4,3,2,7};
        System.out.println(Arrays.toString(numsort));// orjinali bastirdik

        sortArray(numsort);// metoddan cagirip.
        System.out.println(Arrays.toString(numsort));// yazdirdik

    }
    public static void sortArray(int[] array){ // yeni isim ve int ismiyle bir metot olusturduk.
        Arrays.sort(array);//yukaridan alip sirlarayarak
        System.out.println(Arrays.toString(array));// bascak
        // metoda gelen sort edilen Arrayin degeri degisir

    }
}
