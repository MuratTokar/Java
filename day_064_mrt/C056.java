package day_064_mrt;

public class C056 {
    public static void main(String[] args) {
        String str=" ";
        str.trim();// str tekrar esitlenmedigi icin bu metoto ise yaramaz
        System.out.println(str.equals("") + " " + str.isEmpty());
                            // fals                falls
        // CEVAP= C-falls falls

        // isEmpty()=Bos mu? bos ise tru degilse falls ///herhangi bir karakter barindiriyor mu
        // isBlank()=bosluk haricinde bir elemani yoksa true ,varsa fallls
    }
}
