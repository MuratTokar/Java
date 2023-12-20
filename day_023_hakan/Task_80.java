package day_023_hakan;

public class Task_80 {

    public static void main(String[] args) {
        String mainText = "Your order confirmation number is XYZ";
        String partText = "confirmationA";
        checkStringContain(mainText, partText);

    }

    public static void checkStringContain(String mainText, String partText){
        int index = mainText.indexOf(partText);
        if(index < 0){
            System.out.println("Not found");
        } else {
            System.out.println(index);
        }
    }
}
