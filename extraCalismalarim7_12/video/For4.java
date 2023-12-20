package extraCalismalarim7_12.video;

public class For4 {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
         */

     String str="Murat";
        for (int i =str.length()-1; i  >=0; i--) { //.yol
            System.out.print(str.charAt(i));

        }


        String str1="Java";//2.yol
        String output="";

        for (int i = str1.length()-1; i  >=0; i--) {
            output+=str1.charAt(i);

        }
        System.out.println(output);

    }

}
