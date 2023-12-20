package day_065_hakan;

public class Q82 {}

class Alpha {
    int ns;
    static int s; // 0 - 50 - 125 - 100
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

class Test82{
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint(); // ref1.ns = 50
        ref2.doPrint(); // ref2.ns = 125
        ref3.doPrint(); // ref3.ns = 0
        // s = 125
    }
}
// ns = 50 , s = 125
// ns = 125 , s = 125
// ns = 0 , s = 125