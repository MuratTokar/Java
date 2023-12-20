package day_065_mrt;

public class C065 {
    public static void main(String[] args) {
        float var1=(12_345.01<=123_45.00) ? 12_456 : 124_56.02f; // burada boolean bir sart var True yada fallse
        float var2=var1+1024;
        // float a=12456; olursa sonuc 12456.0 olurdu sorun olmazdi.int aldi float a atadi
        // float a=12456.0 olursa hata verir cunku double yi float a atamis olurduk ki o da hata veirir
        System.out.println(var2);

        // Was ist result?
        // CEVAP=D----> 13480.02
    }
}
