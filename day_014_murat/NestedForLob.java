package day_014_murat;

public class NestedForLob {
    public static void main(String[] args) {
for (int i =1; i<=5; i++){
    System.out.print(i);

    for (int j=1; j<=i; j++ ){
        System.out.print( " süt " );
    }
    System.out.println();
}
        System.out.println("###################");
        for (int i =1; i<=10; i++) {
            System.out.print(i);
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*i + "\t");
            }
            System.out.println();

        }
        for (int i = 1; i <= 6; i++) {
            System.out.println('*');
            for (int j = 1; j <=i; j++) {
                System.out.print('*');

            }


        }
    }
}
