package day_015_murat;

public class Task_54 {
    public static void main(String[] args) {
        int start = 1;
        int sum = 0;
        do {
            if (start % 2 == 0) {
                continue;
            }
            sum += start;
            System.out.println("ara top:" + sum);
        } while (++start <= 10);
        System.out.println("genel toplam :" + sum);


    }
}
