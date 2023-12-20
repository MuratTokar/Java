package day_070_mrt;

public class C188 {
    public static void main(String[] args) {
      CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
        // line n1  Buraya ne yazarsak 0 basar
       // acct.amount=0;
       // acct.setAmount(0);
        System.out.println(acct.getAmount());

    }
}
class CheckingAccount {
    public int amount;
    public CheckingAccount (int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void changeAmount (int x) {
        amount += x;
    }
}

// A. acct.setAmount(-acct.getAmount()); // - randomSayi
// B. acct.amount = 0; // 0
// C. acct.setAmount(0); // 0
// D. acct.getAmount() = 0; // compile error
// E. this.amount = 0; // this can not be used in outer class, compile error
// F. acct.changeAmount(0); // amount randomSayi
// acct.changeAmount(-acct.amount); // 0
// acct.changeAmount(-acct.getAmount()); // 0
// G. acct.changeAmount(-acct.amount); // 0

