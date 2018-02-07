package Unit2;

public class BankAccountTester
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(400);

        System.out.print("Current balance: ");
        System.out.println(account.getBalance());

        System.out.println("Expected balance: 100");
    }
}