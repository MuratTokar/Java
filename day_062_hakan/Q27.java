package day_062_hakan;

public class Q27 {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount();
        // line n2
        // B false
        // this.amount = 100; false
        // C false
        // amount = 100; false

        // E true
        // acct.amount = 100;

    }
}

class CheckingAccount{
    public int amount;
    // line n1

    // A true
    // public CheckingAccount(){
     //   amount = 100;

    }

    // D true
   /* public CheckingAccount(){
        this.amount = 100;
    } */

    // F false
   /* public CheckingAccount(){
        acct.amount = 100;
    } */



