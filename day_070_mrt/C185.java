package day_070_mrt;

public class C185 {
}
/*
package p1;

public class A{
}

package p1.p2;
 // line n1
 public class B{
 public void doStuff(){
 A b = new A();
   }
 }

 package p3;
 // line n2
 public class  C {
 public static void main(String[] args){
 A o1 = new  A();
 B o2 = new B();
   }
 }

 Which modification enables the code to comppile?
 Hangi degsiiklik kodun derlemsini saglar?
 */


// cevap=C

// line n1
// import p1.A;

// line n2
//import p1.A
//import p1.p2.B;
