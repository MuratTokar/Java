package homework12;

public class Cozum_2 {
    public static void main(String[] args) {
        /*
        Girilen bir harfin sesli olup olmadigini, sesli harfin büyük-kücük harf oldugunu veren programi
yaziniz.
Input : a Output : Kücük sesli harf
Input : k Output : Sessiz harf
Input : O Output : Büyük sesli harf
         */
String harf="a";
switch (harf) {
    case "a":
    case "e":
    case "i":
    case "o":
    case "u":

        System.out.println("Kücük sesli harf");
        break;
    case "A":
    case "E":
    case "I":
    case "O":
    case "U":
        System.out.println("Sessiz harf");
    default:
        System.out.println("Sessiz harf");
}

    }
}
