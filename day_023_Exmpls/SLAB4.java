package day_023_Exmpls;

public class SLAB4 {
    public static void main(String[] args) {


        //   1. yol

        String input1="Bugun harika", input2="ika bir gun.";


        String inputY=input2.substring(4);
        System.out.println(input1.concat(" ").concat(inputY));


        //  2. yol


        String istenenInput = "";

        for (int i = 0; i < input1.length(); i++) {
            if (input2.startsWith(input1.substring(i))) {
                istenenInput = input1 + input2.substring(input1.length() - i);
                break;
            }
        }

        if (istenenInput.equals("")) {
            istenenInput = input1 + " " + input2;
        }

        System.out.println(istenenInput);
    }
}
