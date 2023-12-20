package day_067_hakan;

public class Q108 {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D"};
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i] + " ");
            if(arr[i].equals("D")){
                System.out.println("Work done");
            }
            continue;
            // System.out.println();
        }

    }
}
