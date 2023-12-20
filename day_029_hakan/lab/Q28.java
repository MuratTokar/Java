package day_029_hakan.lab;

import java.util.Arrays;

public class Q28 {
    /**
     * Girilen 2 sayi arasinda birer artan ardisik
     * sayilari kullanarak bir array olusturan program
     * Alt sinir dahilken, üst sinir dahil olmayacak
     *
     */

    public static void main(String[] args) {
        giveSequenceArray(5,10);
        giveSequenceArray(11,18);
        giveSequenceArray(1,3);
    }

    public static void giveSequenceArray(int start, int end){
        int[] seq = new int[end-start];
        for(int i = 0; i < seq.length; i++){
            seq[i] = start + i;
        }
        System.out.println(Arrays.toString(seq));
    }
}
