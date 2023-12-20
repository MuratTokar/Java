package day_068_mrt;

public class C163 {
    public static void main(String[] args) {
        int x=1;
        int y=0;
        if (x++>++y){
            System.out.println("Hallo");

        }else {
            System.out.println("Welcome");

        }
        System.out.println("Log " + x + ":" + y);
    }
} // Cevap=C (Welcome Log 2:1)
