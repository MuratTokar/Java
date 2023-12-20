package day_26_murat;

public class Q_12 {
    public static void main(String[] args) {
        // 2 array parametre olarak kabul eden bir metot yazin
        // ilk elemani 1 degerinde olan arraylarin sayisini bastiran program

        int[] x={1,2,3}; // 2
       int[] y={1,3};

        //int[] x={7,2,3};
       // int[] y={1}

        //int[] x={3,2,4};
        //int[] y={4,3,4};

        checkFirstelement(x,y);// metodu cagirdik

    }
    public static void checkFirstelement(int[] nums1,int[] nums2){// 1
        int counter=0;// 3

        if (nums1[0]==1)// 4
            counter++;// 5

        if (nums2[0]==1)// 6
            counter++;// 7

        System.out.println(counter);// bastik

    }

}
