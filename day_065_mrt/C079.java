package day_065_mrt;

public class C079 {
}

class C{
    public C(){ // contructor
        System.out.print("C ");
    }
}

class B extends C {
    public B(){ //// contructor            // line n1
        // super(); C
        System.out.print("B ");
    }
}

class A extends B {
    public A(){ // // contructor            // line n2
        // super(); B
        System.out.print("A ");
    }

    public static void main(String[] args) {
        A a = new A(); // a objesi önce A ya gidecek ama gizli constructor sayesinde B ye gidecek ve B de C ye gönderecek.
        // ve önce C yi basacak sonra B yi basacak ve cagrildigi yere yani A ya geri donüp A yi da basacak

        // Cevap=C B A
    }
}
