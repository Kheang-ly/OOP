public class BankingAccount {
    double balance;

    public BankingAccount(double balance) {
        this.balance = balance;
    }
    public BankingAccount()
    {
        this.balance=10;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static boolean is_balance_not_available(BankingAccount banking_account,double amount)
    {
        if(banking_account.getBalance()<amount)
            return true;
        return false;
    }
    public static void withdraw(BankingAccount banking_account,double amount)
    {
        double old_balance=banking_account.getBalance();
        banking_account.setBalance(old_balance-amount);
        System.out.println(" Successful Withdraw ");
        System.out.println();
    }
    public static void deposit(BankingAccount banking_account,double amount)
    {
        double old_balance=banking_account.getBalance();
        banking_account.setBalance(old_balance+amount);
        System.out.print(" Successfully Deposit! ");
        System.out.println();
    }
}
