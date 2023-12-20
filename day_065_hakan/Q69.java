package day_065_hakan;

public class Q69 {
    public static void main(String[] args) {
        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i= 97;

        for(int a = 0; a < chs.length; a++) {
            for(int b=0; b< chs[a].length; b++){
           // for(int b=0; b< chs.length; b++){
                chs[a][b] = "" + i;
                i++;
            }
        }

        for(String[] ca : chs){
            for(String c : ca){
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}

// a=0 b=0
// a=0 b=1
// a=0 b=2  // ArrayIndexOutOfBoundException runtime error

// a=0 b=0 chs[0][0]="97"
// a=0 b=1 chs[0][1]="98"

// a=1 b=0 chs[1][0]="99"
// a=1 b=1 chs[1][1]="100"
// a=1 b=2 chs[1][2]="101"
// a=1 b=3 chs[1][3]="102"
// a=1 b=4 chs[1][4]="103"

// a=2 b=0 chs[2][0]="104"
// a=2 b=1 chs[2][1]="105"

// a=3 b=0 chs[3][0]="106"
// a=3 b=1 chs[3][1]="107"

// a=4 b=0 chs[4][0]="108"
// a=4 b=1 chs[4][1]="109"