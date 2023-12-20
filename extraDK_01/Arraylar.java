package extraDK_01;

public class Arraylar {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 3;
        arr[1] = 4;
        arr[8] = 9;
        arr[9] = 6;

        String[] arr2={"ali","veli","Yavuz"}; // bu sekildede atama yapariz
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i] + " ");

        }
        System.out.println();// 2 array in arasina bosluk atti

      /*try {


     for (int i = 0; i < 11; i++) {  arrayin uzunlugunu asan deger verdik ve ortaya cikan exception u da try catch ile sarmaladik
        System.out.print(arr[i] + " ");

     }
       }catch (ArrayIndexOutOfBoundsException a){
     a.printStackTrace();
         }

          }*/


        // int a=arr[8];// a ya arr 8.index i atadik ve degeri 9 oldu
        // System.out.print(a);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");// 3 4 0 0 0 0 0 0 9 6  deger atanmayan  indexlere default olarak 0 atadi

        }
        System.out.println();
        System.out.println("******************");

        // iki boyutlu array

        int[][] ikibyt=new int[3][10];// 3 array var ve her biri 10 elemanlidir
        ikibyt[2][7]=38; // 2.arrayin 7.index ine 38 atadik
        ikibyt[0][0]=54;
        ikibyt[1][3]=6;
        for (int i = 0; i <ikibyt.length ; i++) {
            for (int j = 0; j <ikibyt[0].length; j++) {
                System.out.print(ikibyt[i][j] +" ");
            }
            System.out.println();
            
        }

    }
}
