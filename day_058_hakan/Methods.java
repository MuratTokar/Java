package day_058_hakan;

public class Methods {

    public static void main(String[] args) {
        int a = 5, b = 10;

        //int sum = sum(a,b);
        //int sum = sum(2,3);
        Integer x =10;
        Integer y =20;
        int sum = sum(x,y);
        //int sum2 = sum(a,b,5,6,7,8);
        System.out.println(sum);
        //System.out.println("a,b,5,6,7,8 toplami : " + sum2);

        int multiply = multiply(a,b);
        System.out.println(multiply);

        int denklem = sum(multiply(a,5), multiply(2,b));
        System.out.println(denklem);
    }

  /*  public static int sum( int... nums){
        int total = 0;
        for(int i : nums){
            total += i;
        }
        return total;
    }*/

    public static int sum( int a, int b){
        System.out.println("int");
        return a+b;
    }

    public static int sum( Integer a, Integer b){
        System.out.println("Integer");
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }
}
