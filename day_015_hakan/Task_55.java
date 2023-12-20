package day_015_hakan;

public class Task_55 {

    public static void main(String[] args) {
        // i=0
        // i=8

        // print 8  i=7
        // print 7  i=6
        // print 6  i=5
        // print 5  i=4
        // if(i == 4) => break outer;

        int i=0;

        do{
                outer:
                do{
                    i=8;
                    inner:
                    while(true){
                        System.out.println(i--);
                        if(i==4){
                            break outer;
                         }
                     }

                }while(true);

            System.out.println("outer loop unun disina cikti");

        } while(true);

    }
}
