package day_015_hakan;

public class LabeledStatements {
    public static void main(String[] args) {

        // Ic ice for dongusu, carpma islemi gibidir
        int count=0;
        label1:for (int i = 1; i <= 4; i ++){
            System.out.println("i'nin degeri : " + i);
            label2:for(int j=1; j <= 3; j++){
                System.out.println("j'nin degeri : " + j);
                label3:for(int k = 1; k<= 2; k++){
                    if(count == 5){
                        System.out.println("Burada koddan cikilacak");
                       // break label2;
                        continue label1;
                    }
                    System.out.println("k'nin degeri : " + k);
                    count++;
                }
            }
        }

        System.out.println("counter : " + count);
    }
}
