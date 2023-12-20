package day_015_hakan;

public class LabeledStatements2 {

    public static void main(String[] args) {
        label1:for(int i=1; i <=5; i++){

            for (int j=1; j<=4; j++){
                if(i==3){
                    System.out.println("Gereksiz yazdirilan kod, cunku i'nin degeri " + i);
                    continue label1;
                }
                System.out.println("Dis Loop : " + i + "\tIc Loop : " + j);
            }

        }
    }
}
