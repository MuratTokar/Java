package day_010_hakan;

public class IfStatements {
    public static void main(String[] args) {
        boolean condition = true;
        if(condition) {
            // condition true ise, iceriye gir ve icerideki islemi yap
        }


        int x, y =20;
        if(y == 20) {
            // condition true ise, iceriye gir ve icerideki islemi yap
            x = 5;
        }


        int workedHours = 50;
        double payRateHourly = 20;
        if (workedHours > 40) {
            //payRateHourly = payRateHourly * 1.5;
            payRateHourly *= 1.5;
        }

        if(20> 100)
            System.out.println("20, 10 dan büyüktür");

        // if statement ta, süslü parantez kullanilmazsa, if satirinin altindaki TEK satiri isleme alir, diger satirlar isleme alinmaz

        System.out.println("Merhaba");

        int n1, b=50,c=110;
        if(b==50 && c >= 100){
            n1=20;
        }

        int idealTemp = 25;
        int temp = 75;
        if (70 < temp && temp < 80) // 70 < temp && temp < 80
            System.out.println(idealTemp);



















    }
}
