package day_013_murat;

public class Task40 {
    public static void main(String[] args) {
        for (int i=2; i<=100; i+=2){
            System.out.print(i +" , ");// son sayidan sonra virgul görünüyor.Bunu yok etmenin yolu
        }


        System.out.println("******************************************************************************************");
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0){
                System.out.print(i +" ");
            }
            
        }


    }
}
