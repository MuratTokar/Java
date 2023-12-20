package day_069_hakan;

public class Q174 {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8").msg);
        System.out.println("Hello " + new MyString("Java SE 8"));
    }
}

class MyString {
    String msg;
    MyString(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}