package day_065_hakan;

public class Q79 {
}

class C79{
    public C79(){
        System.out.print("C ");
    }
}

class B79 extends C79{
    public B79(){             // line n1
        // super(); C
        System.out.print("B ");
    }
}

class A79 extends B79 {
    public A79(){             // line n2
        // super(); B
        System.out.print("A ");
    }

    public static void main(String[] args) {
        A79 a = new A79();
    }
}
