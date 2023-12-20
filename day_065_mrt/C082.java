package day_065_mrt;

public class C082 {
}

class Alpha {
    int ns;
    static int s; // s nin son degeri 125
    Alpha(int ns){
        if(s < ns){
            s = ns;
            this.ns = ns;
        }
    }

    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }
}

class Test82 {
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50); //
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint(); // ref1.ns = 50
        ref2.doPrint(); // ref2.ns = 125 .S nin son degeri ortak olacak
        ref3.doPrint(); // ref3.ns = 0
        // s = 125

        // s static oldugu icin hepsi de s in son degerini ortak alacaklar

        // ns=50,s=0
        //s<ns--->>  s=50  ns 50
        // ns=125
        // s<ns-->> s=125  ns 125
        // ns=100
        // s<ns-->> s=0     ns 0 ns default degeri alir

        // Cevap=
        // ns = 50 s = 125
        //ns = 125 s = 125
        //ns = 0 s = 125
    }
}