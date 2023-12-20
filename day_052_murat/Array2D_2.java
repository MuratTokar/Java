package day_052_murat;

public class Array2D_2 {
    public static void main(String[] args) {


        int[][] numbers = {{1, 5, 8, 12}, {4, 8, 9, 3}, {0, 13, 15, 30}};

      /*  2. Satirlarin ve kolonlarin kendi arasinda toplamlari
           1. satirdaki sayilarin toplami : 26
           2. satirdaki sayilarin toplami : 24
           3. satir ...

           1. kolondaki sayilarin toplami ...*/

        // satirlari yazdirma
        int satir=1;
        for(int[] arr:numbers){
            int sum=0;
            for (int num:arr){
                sum+=num;

            }
            System.out.println(satir + ". satirdaki sayilarin toplami = " + sum);
            satir++;
        }
        // sutunlari yazdirma
        int kolon1 = numbers[0][0] + numbers[1][0] + numbers[2][0];
        int kolon2 = numbers[0][1] + numbers[1][1] + numbers[2][1];
        int kolon3 = numbers[0][2] + numbers[1][2] + numbers[2][2];
        //int kolon4 = numbers[0][3] + numbers[1][3] + numbers[2][3];

        System.out.println("******* 2.soru alternatif cozum ********");
        // sutunlarin toplami
        // lengthleri esit olan arrayler icin
       /* int numColumns = numbers[0].length;
        for (int col = 0; col < numColumns; col++) {
            int colSum = 0;
            for (int[] arr : numbers) {
                colSum += arr[col];
            }
            System.out.println(colSum);
        }*/

        System.out.println("******* 2.soru alternatif cozum (taking care of different length ) ********");
        // length leri farkli veya esit olan arrayler icin
        int maxLength = 0;
        for(int[] arr : numbers){
            if(maxLength < arr.length){
                maxLength = arr.length;
            }
        }

        int[] sumOfColumns = new int[maxLength];
        //Arrays.fill(sumOfColumns, 5);

        for(int[] arr : numbers){
            for(int i=0; i< arr.length ; i++){
                sumOfColumns[i] += arr[i];
            }
        }

        for(int i=1; i<= sumOfColumns.length ; i++){
            System.out.println(i+ ". kolondaki sayilarin toplami " + sumOfColumns[i-1]);
        }

    }
}