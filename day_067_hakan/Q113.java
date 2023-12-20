package day_067_hakan;

public class Q113 {
    private static int stock = 10;
    private int qty = 5;
    void purchase(int qty){
        stock += qty;
    }

    void sell(int qty){
        stock -= qty;
    }

    void printStock(String action){
        System.out.println(action + ":" + qty +
                " items. Stock in Hand: " + stock);
    }

    public static void main(String[] args) {
        Q113 k1 = new Q113();
        k1.sell(5);
        k1.printStock("Sold");
        // Sold: 5 items. Stock in Hand: 5

        Q113 k2 = new Q113();
        k2.purchase(5);
        k2.printStock("Purchased");
        // Purchased: 5 items. Stock in Hand: 10
    }
}



