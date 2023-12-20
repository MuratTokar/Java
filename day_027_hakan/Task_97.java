package day_027_hakan;

public class Task_97 {

    public static void main(String[] args) {
        String str = "((W&e*_lco3me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";

        // 1.yol
        // str = str.replaceAll("[^a-zA-Z ]","");
        //System.out.println(str);
        getLetters(str);
        getLetters_2(str);
        getNumbers(str);

    }

    public static void getLetters(String str){
        for(int i=0; i < str.length(); i++) {
            if (!(Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ')) {
                str = str.replace(str.charAt(i) + "", "");
                i--;
            }
        }
        System.out.println(str);
    }

    public static void getLetters_2(String str) {
        String strNew="";
        for(int i=0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || str.charAt(i) == ' ') {
                strNew += str.charAt(i) + "";
            }
        }
        System.out.println(strNew);
    }

    // Task 98
    public static void getNumbers(String str){
        for(int i=0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                str = str.replace(str.charAt(i) + "", "");
                i--;
            }
        }
        System.out.println(str);
    }
}
