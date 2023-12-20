package day_068_mrt;

public class C146 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx = 0;
        for(String s : strs){
            strs[idx].concat(" element " +
                    "" +
                    "" + idx); // strs[idx] = null  // atama yapilamamis bu for bos
            idx++;
        }
        for(idx =0; idx < strs.length; idx++){ //
            System.out.println(strs[idx]);
        }
        // Cevap=D (NullPointerException) cconcat methodu null kabul etmediginden dolayi NullPointerException veririr
    }
}
// String null oldugunda, String methodlari NullPointerException gonderir

