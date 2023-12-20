package day_062_hakan;

public class Q36 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        for(int i=0; i < arr.length ; i++ ){
            System.out.println(arr[i] + " "); // print : A
            if(arr[i].equals("C")){
                continue;
            }
            System.out.println("Work done"); // print : Work done
            break; // loop tan cikti
        }
    }
}
