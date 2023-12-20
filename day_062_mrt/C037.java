package day_062_mrt;

public class C037 {
    public static void main(String[] args) {
        int[] data={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;
        for (int e:data){
            if (e !=key){
                continue;// continue den sonra kod yazilmaz
               // count++;  bu yanlis// cevap=A(compilation fails)
            }
            System.out.println(count+"Found");
        }
    }
}
