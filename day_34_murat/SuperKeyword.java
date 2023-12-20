package day_34_murat;

public class SuperKeyword {
}
    class A {
        String className = "class A";

        public A(){
            // burada gizli bir super() var.her zaman ilk super() constructor u cagirir
            System.out.println("A constructor");
        }
        public A(String className){
            System.out.println("A parametreli constructor");
        }
        public void printCourse() {
            System.out.println(className);

        }

    }

    class B1 extends A {
        String className = "class B1";
        public B1(){
            // burada gizli bir super() var.her zaman ilk super() constructor u cagirir
            System.out.println("B1 constructor");
        }
        public B1(String className){
            super(className);
            super.printCourse();// super ile metot cagirdik
            System.out.println(super.className);// super ile variable cagirdik
            System.out.println("B1 parametreli constructor");
        }
            public void printCourse () {
                System.out.println(className);

            }
        }


    class B2 extends A {
        String className = "class B2";

        public B2(){
            // burada gizli bir super() var.her zaman ilk super() constructor u cagirir
            System.out.println("B2 constructor");
        }
        public B2(String className){
            System.out.println("B2 parametreli constructor");
        }
        public void printCourse() {
            System.out.println(className);
        }

    }

    class C1 extends B1 {
        String className = "class C1";

        public C1(){
            // burada gizli bir super() var.her zaman ilk super() constructor u cagirir
            System.out.println("C1 constructor");
        }
        public void printCourse() {
            System.out.println(className);
        }
        public C1(String className){
            super(className);
            super.printCourse();
            System.out.println(super.className);
            System.out.println("C1 parametreli constructor");

        }

    }


     class testConstructor{
    public static void main(String[] args) {
       C1 c1=new C1();// obje ile class c1 i cagirdik
        System.out.println(c1.className);// once C1 e ,sonra B1 e,sonra A ya
        // variableleri asagidan yukariya dogru arar ve ilk buldugunu alir
        System.out.println("********methot call");

        c1.printCourse();//methodu cagirdik.asagidan yukariya dogru arar
        System.out.println("********constructor*****");
        // consructor ilk buldugu constructor in icersindeki
        // gizli super();
        C1 c2=new C1("Java class");// constructoru call ettik
    }
}