package day_27_murat;

public class Task_96 {
    public static void main(String[] args) {
        // stringten fahrenheit degerini cek
        // fahrenheit dgerini celciusa cevir ve sonucu yazdir
        // stringten fehrenheit degerini cek
        // fahrenheit degerini celcius a cevir
        // sonucu yazdir

        String str = "Today weather is sunny and 72 degree. " +
                "It is a perfect day to practice java. :)";

        int degreeIndex = str.indexOf("degree");
        String value = str.substring(degreeIndex - 4, degreeIndex); // .trim()
        value = value.trim();
        int valueInt = Integer.parseInt(value);
        double celciusValue = fahrenheitToCelcius(valueInt);
        int a = (int) (celciusValue*100);
        celciusValue = a/100.0;


        System.out.println(valueInt + " degree is equal to " + celciusValue + " celcius.");

    }

    public static double fahrenheitToCelcius(double fahrenheit){
        double celcius = 100*(fahrenheit - 32)/180;
        return celcius;

    }


}



