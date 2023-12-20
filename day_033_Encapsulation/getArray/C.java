package day_033_Encapsulation.getArray;

public class C {
    private int[] numbers = {1,2,3};


    public void displayNumbers(){
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i!=numbers.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");


    }

    public  void setNumbers(int[] newNumbers){
        this.numbers=newNumbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

}
