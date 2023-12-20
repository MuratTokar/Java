package day_064_hakan;

public class Q52 {

    public static void main(String[] args) {
        String[][] chs = new String[2][]; // {{A}, {B}}
        chs[0] = new String[2];// {A} = {a,b}
        chs[1] = new String[5];// {B} = {a,b,c,d,e}
        int i =97;

        for(int a =0; a< chs.length; a++){ // 0, 1
            for(int b=0; b< chs.length; b++){ // 0, 1  // chs[a].length
                chs[a][b] = "" + i;
                i++;
            }
        }
        // chs[0][0] = 97  -> i = 98
        // chs[0][1] = 98 -> i = 99
        // chs[1][0] = 99 -> i = 100
        // chs[1][1] = 100 -> i =101

        // {A} = {97,98}
        // {B} = {99,100,null,null,null}

        for(String[] ca : chs){
            for(String c : ca){
                System.out.print(c + " ");
            }
            System.out.println();
        }

        // a b
        // a b c d e

        // 97 98
        // 99 100 null null null

        // Arraylerde deger atamasi yapilmazsa,
        // default degerleri instance variable default degerleri gibi olur...

        boolean[] arr = new boolean[2];
        for(boolean k : arr){
            System.out.println(k);
        }
    }
}
