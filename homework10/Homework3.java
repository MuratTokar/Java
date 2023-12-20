package homework10;

public class Homework3 {
    public static void main(String[] args) {
     /* 3-
      Girilen sayinin hangi güne denk geldigini gösteren programi yaziniz.
Input : 4 Output : Persembe
Input : 17 Output : Carsamba
1=Pazartesi,2=Sali,3=Carsamba,4=Persembe,5=Cuma,6=Cumartesi,0=Pazar
      */
int input=17;



        if (input%7==1) System.out.println("Pazartesi günüdür");

        if (input%7==2) System.out.println("Sali günüdür");

        if (input%7==3) System.out.println("Carsamba günüdür");

        if (input%7==4) System.out.println("Persembe günüdür");

        if (input%7==5) System.out.println("Cuma günüdür");

        if (input%7==6) System.out.println("Cumartesi günüdür");

        if (input%7==0) System.out.println("Pazar günüdür");


    }
}
