package day_061_hakan;

public class Q11 {
    public static void main(String[] args) {
        String[] strs = {"A","B"};
        int idx = 0;
        // concat assign edilmedigi icin array in icerisindeki
        // element leri degistirmez
        // Yani asagidaki for dongusu bosuna calisir
        for(String s : strs){
            strs[idx].concat(" element " + idx);
            idx++;
        }
       // System.out.println(idx);
        // sirasi ile 0 ve 1. indexteki elementleri ekrana yazdirir
        for(idx = 0; idx < strs.length ; idx++){
            System.out.print(strs[idx]);
        }
    }
}
// AB
