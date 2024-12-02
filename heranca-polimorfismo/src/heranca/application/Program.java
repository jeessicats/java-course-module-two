package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account account = new Account(1001, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting

        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "John", 0.0, 500.0);
        Account account3 = new SavingsAccount(1004, "Anna", 0.0, 500.0);

        //Downcasting

        BusinessAccount account4 = (BusinessAccount) account2;
        account4.loan(100.0);

        //;
        if (account3 instanceof BusinessAccount) {
            BusinessAccount account5 = (BusinessAccount) account3;
            account5.loan(100.0);
            System.out.println("Loan! ");
        }

        if (account3 instanceof SavingsAccount) {
            SavingsAccount account5 = (SavingsAccount) account3;
            account5.updateBalance(100.0);
            System.out.println("Update! ");
        }
    }
}
