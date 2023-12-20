package day_017_hakan;

public class Task_60 {

    public static void main(String[] args) {
        calculate(10,2,"/"); // 5
        calculate(10,2,"+"); // 12
        calculate(10,2,"-"); // 8
        calculate(10,2,"*"); // 20

        calculate(10,2,'/'); // 5
        calculate(10,2,'+'); // 12
        calculate(10,2,'-'); // 8
        calculate(10,2,'*'); // 20

        int sonuc;
        sonuc = calculateReturn(10,2,"/"); // 5
        System.out.println(sonuc);
        sonuc = calculateReturn(10,2,"+"); // 12
        System.out.println(sonuc);
        sonuc = calculateReturn(10,2,"-"); // 8
        System.out.println(sonuc);
        sonuc = calculateReturn(10,2,"*"); // 20
        System.out.println(sonuc);



    }

    public static void calculate(int num1, int num2, String operator){
        switch(operator){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Lütfen gecerli bir islem giriniz!");
                break;
        }
    }

    public static void calculate(int num1, int num2, char operator){
        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Lütfen gecerli bir islem giriniz!");
                break;
        }
    }

    public static int calculateReturn(int num1, int num2, String operator){
        switch(operator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.println("Lütfen gecerli bir islem giriniz!");
                return 0;
        }
    }
}
