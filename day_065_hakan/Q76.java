package day_065_hakan;

public class Q76 {
}

abstract class Planet {
    protected void revolve(){

    }

    abstract void rotate();
}

class Earth extends Planet {
     protected void revolve(){}
    // private void revolve(){}
     protected void rotate(){}
    // private void rotate(){}
}



// override edilen methdun access modifier i,
// super classtakine ya esit ya da daha genis olmali

// default ise ; default, protected, public
// protected ise; protectred veya public olabilir
// public ise public olmak zorunda