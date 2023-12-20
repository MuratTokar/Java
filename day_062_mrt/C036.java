package day_062_mrt;

public class C036 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
            if (arr[i].equals("C")) { // ilk sayi c ye esit degil sadece a yi basip cikti
                continue;

            }
            System.out.println("Work done");// AWork done
            break;// break oldugu icin loop dan cikti sadece A ve Work done yazdi
        }
    }
}