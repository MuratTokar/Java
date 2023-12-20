package day_17_murat;

public class HierarchicalMethodCalls {
    public static void main(String[] args) {
        denklemCoz(6);
        // Verilen bir  sayinin 2 katinin ,3 te birinin 5 fazlasini hesaplayan programi yazin
        // carpmaya,bölmeye,toplamaya ihtiyac var
    }
    public static double toplama(double a){
     return a+5;
    }
    public static double carpma(double a){
      return 2*a;
    }
    public static double bölme(double a){
     return a/3;
    }
    public static void denklemCoz(double a){
  double sonuc= carpma(a);
   sonuc=bölme(sonuc);
  sonuc= toplama(sonuc);
        System.out.println("Sonuc:" + sonuc);



    }
}
