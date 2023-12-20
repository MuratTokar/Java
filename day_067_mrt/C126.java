package day_067_mrt;

public class C126 {
    public static void main(String[] args) {

        // Which two code fragments can be independently inserted at line n1 to enable the code to print the elemnts
        // of the array in reverse order? (Choose two.),tersten yazan bagimsiz iki code

        int array[] ={10,20,30,40,50};
        int x=array.length;
        // line n1
      while (x>0){
            x--;
            System.out.print(array[x] + " "); // bu dogru  A
        }
      /*  while (x>0){
            System.out.print(array[--x] + " "); // bu dogru E
        }*/
    }
}
