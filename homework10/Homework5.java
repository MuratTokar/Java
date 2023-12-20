package homework10;

public class Homework5 {
    public static void main(String[] args) {
        /*Girilen sicaklik derecesine göre hava durumunu bildiren programi yaziniz.
        Temp < 0 => Dondurucu soguk
        0 <= Temp < 10 => Cok soguk
        10 <= Temp < 20 => Soguk
        20 <= Temp < 30 => Normal
        30 <= Temp < 40 => Sicak
        40 <= Temp => Cok sicak
        Input : 35 Output : Sicak
         */


        int temp=41;
        
        if (temp<0) {System.out.println("Dondurucu soguk");
        }
        if (0<temp && temp<10) {System.out.println("Cok soguk");
        }
        if (temp>10 && temp<20) {System.out.println("soguk");
        }
        if (temp>20 && temp<30) {System.out.println(" Normal");
        }
        if (temp>30 && temp<40) {System.out.println("Sicak");
        }
        if (temp>40 ) {System.out.println("Cok sicak");
        }
    }
}
