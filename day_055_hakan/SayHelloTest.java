package day_055_hakan;


public class SayHelloTest {

    public static void main(String[] args) {
        SayHello sh = () -> "Hello";
       // SayHello sh2 = (name) ->  { return "Hello" + " " + name;};

        //System.out.println(sh2.greeting("Hakan"));
        System.out.println(sh.sayHello());
       // System.out.println(sh.greeting(""));
    }
}
