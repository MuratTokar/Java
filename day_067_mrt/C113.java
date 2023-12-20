package day_067_mrt;

public class C113 {
    public static void main(String[] args) {
        StockRoom k1=new StockRoom();
        k1.sell(5);
        k1.printStock("sold");
        StockRoom k2=new StockRoom();
        k2.purchase(5);
        k2.printStock("Purchased");

    }

}
 class StockRoom{
    private int stock=10;
    public void purchase(int qty){
        stock+=qty;
    }
    public void sell(int qty){
        stock-=qty;

    }
    public void printStock(String action){
      // System.out.println(action + ":" + qty + "items.+
        // Stock in Hand : " + stock);//  qty tanimlanmadigi icin burada hata verrir

        // cevap=C    Declare the stock and qty variables and the printStock() method static
    }
}

