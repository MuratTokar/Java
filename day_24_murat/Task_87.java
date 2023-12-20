package day_24_murat;

public class Task_87 {
    public static void main(String[] args) {
        String[] tags={"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sobtag"};
        int tagsnnummer=5;
        System.out.println(tags[tagsnnummer-1]);

       // String[] gunler_1 = {"Pazartesi","Sali","Carsamba","Persembe","Cuma","Ctesi","Pazar"};// 1.YOL

        //String[] günler2=new String[]{"Pazartesi","Sali","Carsamba","Persembe","Cuma","Ctesi","Pazar"};// 2.YOL

       // String[] günler3;
       // günler3=new String[]{"Pazartesi","Sali","Carsamba","Persembe","Cuma","Ctesi","Pazar"};//3.YOL

        String[] tags1=new String[7];// 4.YOL
        tags1[0]="Pazartesi";
        tags1[1]="sali";
        tags1[2]="carsamba";
        tags1[3]="persembe";
        tags1[4]="cuma";
        tags1[5]="cumartesi";
        tags1[6]="pazar";

        int günNumarasi=1;
        System.out.println("Bugün günlerden " + tags1[günNumarasi-1]);
    }
}
