package day_24_murat.lab;

public class Q3 {
    public static void main(String[] args) {
        /**
         * 2 arrayi parametre olarak kabul eden bir method yaziniz
         *      // length 1 den büyükse
         *          // ilkElement == sonElement
         *      // uzunluk 1 den büyük degilse, o array icin print array1 veya array2 not valid
         */
        // TC 1 true
       // int[] arr1 = {1,2,3};
       // int[] arr2 = {1,2,5};

        // TC 2 arr1 not valid
        //int[] arr1 = {1};
        //int[] arr2 = {1,2,5};

        // TC 3 arr2 not valid
        int[] arr1 = {1,2,3};
        int[] arr2 = {1};

        // TC 4 true
        //int[] arr1 = {1,2,5};
        //int[] arr2 = {4,2,5};

        // TC 5 false
        //int[] arr1 = {7,2,5};
        //int[] arr2 = {1,2,3};

        // TC 6 true
        //int[] arr1 = {1,2,5};
        //int[] arr2 = {1,2,5};

        // TC 7 arr1 ve arr2 not valid
       // int[] arr1 = {1};
       // int[] arr2 = {5};

        arrayKarsilastirma(arr1,arr2);
    }
    public static void arrayKarsilastirma(int[] arr1,int[] arr2){
        String message="not valid arrays";

        if (arr1.length>1 && arr2.length>1 ){
            System.out.println(arr1[0] ==arr2[0] || arr1[arr1.length - 1 ] ==arr2[arr2.length - 1]);

        }else if (arr1.length<=1){
            message+="arr1";

        }if (arr2.length<=1){
            message+=" , arr2";

        }else {
            message+="arr2";

        }
        System.out.println(message);

    }
}
