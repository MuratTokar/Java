package day_024_hakan;

public class Task_89 {

    // bir string arrayi olusturun ve elemanlarini teker teker yazdiran programi yaziniz

    public static void main(String[] args) {

        String shoppingList[] = new String[10];
        shoppingList[0] = "cheese";
        shoppingList[1] = "pumpkin";
        shoppingList[2] = "bread";
        shoppingList[3] = "eggs";
        shoppingList[4] = "milk";
        shoppingList[5] = "apple";

        for (int i = 0; i < shoppingList.length ; i ++){
            System.out.println((i+1) + ". element : " + shoppingList[i]);
        }

        /**
         * 1. element : cheese
         * 2. element : pumpkin
         * 3. element : bread
         * 4. element : eggs
         * 5. element : milk
         * 6. element : apple
         * 7. element : null
         * 8. element : null
         * 9. element : null
         * 10. element : null
         */


    }
}
