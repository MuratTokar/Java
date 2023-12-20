package day_31_murat;

public class BankAccount {
    /*Banka hesabi olustur.
   BankAccount bankAccount_1 = new BankAccount();
   BankAccount bankAccount_2 = new BankAccount();
- para cek => bankAccount_1.withdraw(300);
- para yatir => bankAccount_1.deposit(500);
- Hesaptaki miktari göster => bankAccount_1.getBalance();
- transfer yap => bankAccount_1.tranfer(bankAccount_2, 200);

bankAccount_2.getBalance(); // 200*/
    double balance;

    public boolean  withdraw(double amount) {// para cekme
       if (this.balance<amount){
           System.out.println("Hesabinizda yeteri para bulunmamamktadir");
           return false;
       }else {
           System.out.println("Para hesaptan cekiliyor");
           this.balance -= amount;
           System.out.println(amount + "Miktar hesaptan cekildi");
           System.out.println(this.balance + "Güncel hesap bakiyesi");
           return true;
       }

    }

    public void deposit(double amount) {// para yatirma
        if (amount>2000){
            System.out.println("2000 den fazla para yatiramazsiniz");
            System.out.println("Lütfen daha kücük bir miktar deneyiniz");
        }else {
            System.out.println("Hesaba para yatiriliyor");
            this.balance += amount;
            System.out.println(amount + " miktari hesaba yatirildi");
            System.out.println(this.balance + "Güncel bakiye");
        }

    }

    public void getBalance() {// hesaptaki parayi gösterme

        System.out.println("güncel bakiye " + this.balance);
    }

    public void transfer(BankAccount bankAccount, double amount) {// baska hesaba para transferi
        if (this.withdraw(amount)) {// hesabimizi cagirdik
            // 1.islem = parayi verilen hesaba yatirma
            // 1.islem = parayi verilen hesaptan cekmek
            System.out.println("Transfer gerceklestiriliyor");
            bankAccount.deposit(amount);
        }else {
            System.out.println("Transfer gerceklestirilemedi");
        }
        System.out.println("Güncel bakiye " + this.balance);
    }
}