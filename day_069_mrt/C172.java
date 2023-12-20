package day_069_mrt;

public class C172 {
    public static void main(String[] args) {
        int num=5;
        do {
            System.out.println(num-- + " "); // once 5 i bas ve sonra azalt
        }while (num==0);   // 5  ve 4 sifira esit degil loptan cikildi
    }
} // cevap=D(5)
