package day_067_mrt;

public class C129 {
    public static void main(String[] args) {
        try {
            int num=10;
            int div=0;
            int ans=num/div;
        }catch (ArithmeticException ae){
          //  ans=0;                        // line n1 ---ans yukarida lokal di .Burda kullanilamaz.Compile error verecek
                                         // ama catch tarafindan yakalanamyacak
        }catch (Exception e){
            System.out.println("Invalid calculation");
        }
      //  System.out.println("Answer = " + ans); // line n2

        // ans variable herhangi bir yerde tanimlanmamis ondan dolayi hata verecekler
    }
    // Cevap= E (Compilation fails at line n1 and line n2)
}
