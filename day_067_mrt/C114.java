package day_067_mrt;

public class C114 {
    public static void main(String[] args) {
        String[][] arr={{"A","B","C"},{"D","E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println(arr[i][j] + " ");
                if(arr[i][j].equals("B")){  // B yi basinca  C yi es gecip ic looptan cikacak ve ust loopa gidip ikinci arrry a girecek
                    break;
                }

            }
            continue;// bunun hukmu yok

            // Cevap =C ( A-B-D-E)

        }
    }
}
