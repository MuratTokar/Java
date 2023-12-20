package day_31_murat;

import day_031_hakan.BankAccount;

public class BankAccontTest {
    public static void main(String[] args) {
        day_031_hakan.BankAccount turgut = new day_031_hakan.BankAccount();
        day_031_hakan.BankAccount firat = new BankAccount();

        System.out.println("\n*****************  balance check *****************");
        turgut.getBalance(); // 0.0
        firat.getBalance(); // 0.0

        System.out.println("\n*****************  withdraw check - *****************");
        turgut.withdraw(100); // Hesabinizda yeterli bakiye bulunmamaktadir.
        firat.withdraw(200); // Hesabinizda yeterli bakiye bulunmamaktadir.

        System.out.println("\n*****************  deposit check *****************");
        turgut.deposit(1000); // Güncel Bakiye : 1000
        firat.deposit(300); //  Güncel Bakiye : 300

        System.out.println("\n*****************  withdraw check + *****************");
        turgut.withdraw(250); // Güncel Bakiye : 750
        firat.withdraw(150); //  Güncel Bakiye : 150

        System.out.println("\n*****************  transfer check + *****************");
        turgut.transfer(firat,250); // Güncel Bakiye : 500
        firat.getBalance(); //  Güncel Bakiye : 400

        System.out.println("\n*****************  transfer check - *****************");
        turgut.transfer(firat,600); // Güncel Bakiye : 500 "Hesabinizda yeterli bakiye bulunmamaktadir."
        firat.getBalance(); //  Güncel Bakiye : 400


    }
}
