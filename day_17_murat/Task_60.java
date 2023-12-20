package day_17_murat;

public class Task_60 {
    public static void main(String[] args) {


calculateGrestest(10,2,"/");
calculateGrestest(10,2,"+");
calculateGrestest(10,2,"-");
calculateGrestest(10,2,"*");

    }
    public static void calculateGrestest(int num1, int num2, String oprerator){
        switch (oprerator){

            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Lütfen gecerli bir islem giriniz");
                break;




        }

        }


    }
