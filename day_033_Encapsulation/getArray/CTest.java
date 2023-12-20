package day_033_Encapsulation.getArray;

public class CTest {

    public static void main(String[] args) {
        C c=new C();

        c.displayNumbers();

        int [] testNumbers=c.getNumbers();// [1,2,3]

        testNumbers[0]=5;

        c.displayNumbers();  // [5,2,3]


        int[] newNums={4,8,12};
        c.setNumbers(newNums);
        c.displayNumbers();  // [4,8,12]
        newNums[0]=100;
        c.displayNumbers();  // [100,8,12]

        int [] newNums_2={5,10,15,20,25};
        c.setNumbers(newNums_2);
        c.displayNumbers();  // [5, 10, 15, 20, 25]

    }



}
