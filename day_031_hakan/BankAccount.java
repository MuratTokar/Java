package day_031_hakan;

public class BankAccount {

    /**
     * Banka hesabi olustur.
     * BankAccount bankAccount_1 = new BankAccount();
     * BankAccount bankAccount_2 = new BankAccount();
     * - para cek => bankAccount_1.withdraw(300);
     * - para yatir => bankAccount_1.deposit(500);
     *      - tek deferde maks 2000€ yatirilabilsin
     * - Hesaptaki miktari göster => bankAccount_1.getBalance();
     * - transfer yap => bankAccount_1.tranfer(bankAccount_2, 200);
     *
     * bankAccount_2.getBalance(); // 200
     */

    double balance;

    public boolean withdraw(double amount){
        // this.balance = this.balance - amount;
        if(this.balance < amount){
            System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir.");
            return false;
        } else {
            System.out.println("Para hesaptan cekiliyor");
            this.balance -= amount;
            System.out.println(amount + " miktari hesaptan cekildi");
            System.out.println("Güncel Bakiye : " + this.balance);
            return true;
        }
    }

    public void deposit(double amount){
        // this.balance = this.balance + amount;
        if(2000 < amount ){
            System.out.println("Tek seferde 2000€'dan fazla para yatirilamaz!");
            System.out.println("Lütfen daha kücük bir miktar deneyiniz!");
        } else {
            System.out.println("Hesaba para yatiriliyor");
            this.balance += amount;
            System.out.println(amount + " miktari hesaba yatirildi");
            System.out.println("Güncel Bakiye : " + this.balance);
        }
    }

    public void getBalance(){
        System.out.println("Güncel Bakiye : " + this.balance);
    }

    public void transfer(BankAccount bankAccount, double amount){

        // 1. islem : parayi verilen hesaba yatirma
        // 2. islem : parayi verilen hesaptan cekme

        if(this.withdraw(amount)){
            System.out.println("Transfer gerceklestiriliyor...");
            bankAccount.deposit(amount);
        } else {
            System.out.println("Transfer gerceklestirilemedi!!!");
        }

        System.out.println("Güncel Bakiye : " + this.balance);
    }
}
