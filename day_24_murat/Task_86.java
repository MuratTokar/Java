package day_24_murat;

public class Task_86 {
    public static void main(String[] args) {
        /**
         * 12 ay ismini icerisinde tutan array olusturunuz.
         */
       /* String[] months={"Hakan"};
        System.out.println(months[0]);
        months[1]="Java";// Array index out of Bounds Exceptions*/

String[] months= {"january","february","märz","April","mai","jun","juli","August","september","oktober","Nowember","Desember"};

        //System.out.println(months[3]);// bu sekilde nisan ayini getirir
        /* ama eger
        int numberOfMonth=12; yapip yazdirikende -1 kullansam tam istedigim ayi alirim
         */
        int numberOfMonth=12;
        System.out.println(months[numberOfMonth-1]);
    }
}
