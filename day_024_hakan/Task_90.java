package day_024_hakan;

public class Task_90 {
    /**
     * 6 araba ismini tutan bir array
     * “Honda” bunlardan biri mi diye check et
     * Iceriyor ise,  print “ I found your car Honda in this array”
     * Icermiyor ise , print “ I could not find your car Honda in this array”
     */

    public static void main(String[] args) {
        String arananAraba = "Java";
        String cars[] = {"Honda", "Toyota", "Nissan", "BMW",
                "Mercedes", "Porsche","Ferrari"};

        boolean isFound = false;
        for(int i = 0; i < cars.length ; i ++){

            if(arananAraba.equals(cars[i])){
                isFound = true;
                break;
            }
        }

       // String message = isFound ? "I found your car " + arananAraba + " in this array : \"I could not find your car \" + arananAraba + \" in this array\";

       // System.out.println(message);

    }
}
