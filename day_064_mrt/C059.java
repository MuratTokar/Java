package day_064_mrt;

public class C059 {
    public static void main(String[] args) {


        double discount=0;
        int qty=Integer.parseInt(args[0]);

        //qty>=90->discount 0,5
        //80<qty<90-> discount 0,2


        /* A-if(qty >= 90){discount=0,5}         // A
         if (qty>80 && qty< 90){discount=0,2}*/  // C

        // C-discount = (qty>=90) ? 0,5 : (qty > 80 ) ? 0,2:0

    }
}
