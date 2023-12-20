package day_060_hakan;

public class Q9 {

}

class CD {
    int r;
    CD(int r){
        this.r = r;
    }

    // CD(){}

}

class DVD extends CD {
    int c;
    DVD(int r, int c){
        // super();
        super(r); // her zaman ilk satirda olmali, yoksa compile error verir
        // code block
        this.c = c;
    }
}
