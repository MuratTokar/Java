package day_017_hakan;

public class LocalVariable {

    public static int num;
    public static void main(String[] args) {
        int num=10;
        test(num);
        System.out.println(num);

        for(int i=1; i<5; i++){
            System.out.println(i);
        }
       // System.out.println(i); i degiskenine döngü disinda ulasilamaz, cünkü local variable
    }

    public static int test(int num1){
        int num = 20; // num degiskenine, method disinda erisilemez, cünkü local variable
            num1 += 2;
            return num1;
    }
}
