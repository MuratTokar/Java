package day_068_hakan;

public class Q146 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx = 0;
        for(String s : strs){
            strs[idx].concat(" element " + idx); // strs[idx] = null
            idx++;
        }
        for(idx =0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }
    }
}
// String null oldugunda, String methodlari NullPointerException gonderir