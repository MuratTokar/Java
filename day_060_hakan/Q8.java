package day_060_hakan;

public class Q8 {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) { // arr.length = 2
            for (int j = 0; j < arr[i].length; j++) { // arr[i].length = 3, 2
                System.out.print(arr[i][j] + " ");
                if (arr[i][j].equals("B")) { // gereksiz code, yokmus gibi dusunulebilir
                    continue;
                }
            }
            continue;
        }

        // A B C D E

        String[] strArr = {};
        for (String str : strArr) {
            if (str.equals("Java")) {
                System.out.println((str + " is the Best"));
                continue;
                //break;
                //System.out.println();// unreachable statement compile error verir
            }
            //System.out.println(" bir programlama dilidir");
        }
    }
}

/**
 * continue => bir donugunun icerisinde  ve
 * bir condition icerisinde kullanilir,
 * kendisinin bulundugu conditionin disindaki,
 * sonra gelen kodu o loop icin pas gecmesini ister.
 *
 * for(String str : strArr){
 *     if(str.equals("Java")){
 *         sout(str + " is the Best");
 *         continue;
 *     }
 *     sout(" bir programlama dilidir")
 * }
 */
