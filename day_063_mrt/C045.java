package day_063_mrt;

public class C045 {
}
abstract class Planet{
    protected void revolve(){  // line n1

    }
    abstract void rotate(); // line n2

}


class Earth extends Planet{// line n3
   // void revolve(){// CEVAP=C D ;bu metot yzkarida protected idi.Burda ya protected yada public olmaliki calissin
   public void revolve(){// CEVAP=C D ;bu metot yzkarida protected idi.Burda ya protected yada public olmaliki calissin

    }
    protected void rotate(){ // line n4

    }
    /*
    * private<default<protected<public
    *  Private= sadece kendi bulundugu calss tan ulasilir
    * default= sadece bulundugu pakette
    * protected=kendi bulundugu pakette ve subclass alrin bulundugu paketler
    * public=projr icerisinden
    * */

}
