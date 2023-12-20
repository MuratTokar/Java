package day_023_hakan;

public class Task_hakan {
    // Girilen bir stringteki sesli harflerin sayisini
    // Girilen bir stringteki sessiz harflerin sayisini
    // veren programi yaziniz

    public static void main(String[] args) {
        String str = "Merhaba dunya, ben uzayli! 45645645677";
        countCharacters(str);
    }

    public static void countCharacters(String text){
        int originalLength = text.length();
        int lengthWithoutVowel = text.replaceAll("[aeuioAEUOI]","").length();
        int countsVowel = originalLength - lengthWithoutVowel;
        int countsNonChars = text.replaceAll("[a-zA-Z]","").length();
        int countsNotVovel = originalLength - countsVowel -countsNonChars;
        System.out.println("Sesli harflerin sayisi : " + countsVowel);
        System.out.println("Sessiz harflerin sayisi : " + countsNotVovel);

        System.out.println(text.replaceAll("[a-zA-Z0-9 ]",""));

    }
}
