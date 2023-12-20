package day_37_murat;

public interface Animal {
    int birthYear=1900;// aslinda arka tarafta gizli bir static final  var ve interface icinde
                       // variable olusturunca degeri degistirilemez
                       // alt classta class ismi ile ulasabiliz

    void eat();
}
// default ve static gercek methot yazilabilir


interface Pet{
    void Walk();
}






class Dog implements Animal,Pet{
    public void eat(){

    }
    public void Walk(){

    }

    public static void main(String[] args) {
        System.out.println(Dog.birthYear);// en ustteki variable ye dog.variableName ile ulastim
    }
}