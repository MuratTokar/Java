package day_014_murat;

public class Task45 {
    public static void main(String[] args) {
        int tekrarSayisi=10;
        int a=22,b=20;
        for (int i =1; i<= tekrarSayisi; i++){
            if (a>b){
                System.out.println(a + " kücüktür " + b + " den");
            }else if(b<a){
                System.out.println(a + " kücüktür " + b + " den");
            }else {
                System.out.println(a + " esittir " + b + " ye");
            }
        }
    }
}
