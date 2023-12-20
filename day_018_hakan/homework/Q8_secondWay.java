package day_018_hakan.homework;

public class Q8_secondWay {

    public static void main(String[] args) {
        applyOperator(2,3,'*');
        applyOperator(2,'*',3);
        applyOperator('-',2,3);

    }

    public static void applyOperator(int a, int b, char operator){
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Lütfen gecerli bir operator giriniz!");
        }
    }

    public static void applyOperator(int a, char operator, int b){
        applyOperator( a, b, operator);
    }

    public static void applyOperator(char operator, int a, int b){
        applyOperator( a, b, operator);
    }
}
