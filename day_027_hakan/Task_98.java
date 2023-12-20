package day_027_hakan;

public class Task_98 {

    public static void main(String[] args) {
        String str ="&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^«f!@^<<i86876ve&%^$ ^%$S$..,,!i!%&#x&@!$";
        String str2 ="N000000i%$!,n9!!!!<e>>>>> 43.**T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        getLetters_2(str);
        getLetters_2(str2);
    }

    public static void getLetters_2(String str) {
        String strNew="";
        for(int i=0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ') {
                strNew += str.charAt(i) + "";
            }
        }
        convertWordToDigit(strNew.split(" "));
        System.out.println(strNew);
    }

    public static void convertWordToDigit(String[] words){
        String numbers="";
        for(String word : words){
            word = word.toLowerCase();
            switch(word){
                case "one":
                    numbers += "1 ";
                    break;
                case "two":
                    numbers += "2 ";
                    break;
                case "three":
                    numbers += "3 ";
                    break;
                case "four":
                    numbers += "4 ";
                    break;
                case "five":
                    numbers += "5 ";
                    break;
                case "six":
                    numbers += "6 ";
                    break;
                case "seven":
                    numbers += "7 ";
                    break;
                case "eight":
                    numbers += "8 ";
                    break;
                case "nine":
                    numbers += "9 ";
                    break;
                case "zero":
                numbers += "0 ";
                break;

            }

        }

        System.out.println("Password : " + numbers);
    }


}
