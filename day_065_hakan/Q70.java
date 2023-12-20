package day_065_hakan;

public class Q70 {
    public static void main(String[] args) {
        int x = 10; // x = 10
        int y = ++x; // y = 11, x = 11
        int z = 0; // z = 0
       // if(y>=10 || y<= ++x){
       if(y>=10 | y<= ++x){ // x=12
            z = x; // z = 12
        } else {
            z = x++;
        }
        System.out.println(z); // z=12
    }
}

// Hint : | ile || arasinda fark vardir.
// | : condition in her iki tarafini da compile edip, sonra OR kontrolu yapar
// || : sol taraf true ise, sag tarafa bakmaya gerek gormez ve
// sagi compile etmeden condition i sonuclandirir

// true | ? : ? compile edilir -> true
// true || ? : ? compile edilmez -> true


// false & ? : ? compile edilir -> false
// false && ? : ? compile edilmez -> false