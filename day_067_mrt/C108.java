package day_067_mrt;

public class C108 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i].equals("D")){ // A B C basacak ve arr in i ninci indexinde  d varsa basip sonra work done basip cikacak
                System.out.print("Work done");
                break;
            }
            continue;

            // Cwvap=A B C D Work done

        }
    }
}
