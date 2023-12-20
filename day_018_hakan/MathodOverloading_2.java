package day_018_hakan;

public class MathodOverloading_2 {

    public static void main(String[] args) {
        display(5);
        display("Hakan");
        display('+');

    }

    public static void display(int num){
        System.out.println("This is " + num);
    }

    public static void display(char c){
        System.out.println("This is " + c);
    }

    public static void display(String name){
        System.out.println("This is " + name);
    }
}
