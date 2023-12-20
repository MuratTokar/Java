package day_24_murat;

public class Task_89 {
    public static void main(String[] args) {
        // bir string arrayi olusturun ve elemanlarini teker teker yazdiran programi yaziniz
        String[] shopingList={"Cheese","pumpkin","bread","eggs","Milk","almonds"};
        for (int i = 0; i < shopingList.length; i++) {
            System.out.println(shopingList[i]);
            System.out.println("****************************************************************************************");
        }
        String[] shop=new String[10];
        shop[0]="Cheese";
        shop[1]="pumpkin";
        shop[3]="bread";
        shop[4]="eggs";
        shop[5]="milk";
        shop[6]="almonds";
        shop[7]="almonds";
        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);

        }
    }
}
