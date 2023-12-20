package day_25_murat;

public class ForEachLoop {
    public static void main(String[] args) {
        //ForEachLoop daha cok Array larda kullanilir.
        int[] nums={1,2,3,4,5};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            System.out.print(" ");// aralara bosluk icin

        }

        System.out.println("#######################################################################################");
        for ( int i:nums ) { // siniri koymuyoruz .dizinin sonuna kadar kendisi sirayla basar
            System.out.print(i+" ");// bosluk icin

        }// for loop index numarasina göre hareket eder,for each ta index kullanilmaz
        // for each bastan sona tüm arrray in degerini okur
        // for loop istenilen aralikta dgerleri okur ve o degerlere islem yapma olanagi verir


    }
}
