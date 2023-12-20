package day_068_mrt;

public class C151 {
    public static void main(String[] args) {
        Alpha ref1=new Alpha(100);
        Alpha ref2=new Alpha(50);
        Alpha ref3=new Alpha(125);
        ref1.doPoint();
        ref2.doPoint();
        ref3.doPoint();
    }
}
class Alpha{
    int ns;
    static int s; // s static oldugu icin degismeyecek
    Alpha(int ns){
        if (s<ns){   // 100 geldi  s<100 ---- ref1 ns 100   s 100--- s 125
                     // 50  geldi  100<50 ----ref2 ns 0      s 100---s 125
                     //125  geldi 100<125-----ref3 ns 125     s125---s 125  s static herkes icin ayni
            s=ns;
            this.ns=ns;
        }
    }
    void doPoint(){ /// static olmayan herseye erisir
        System.out.println("ns= " + ns + "s = " + s);
    }
}
//ns= 100s = 125
//ns= 0s = 125
//ns= 125s = 125