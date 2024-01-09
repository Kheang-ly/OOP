import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        BankingAccount bankingAccount=new BankingAccount(2000);
        User new_user=new User("12","Bun Korng","Bunkorngaddicted@gmail,com","010230280",bankingAccount);
        byte type;
        for(int i = 0; i< User.getUser_list().size(); i++)
        {
            do
            {
                System.out.println(" 1. Account Information ");
                System.out.println(" 2. Withdraw ");
                System.out.println(" 3. Deposit ");
                System.out.println(" 4.Enter number 4 to close application ");
                System.out.print(" Please Select your option: ");
                type=input.nextByte();
                System.out.println();
                switch(type)
                {
                    case 1:
                        new_user.getUser_list().get(i).display();
                        break;
                    case 2:
                        System.out.print(" Input amount: ");
                        double new_balance=input.nextDouble();
                        User.processWithdraw(new_user,(byte)(i),new_balance);
                        break;
                    case 3:
                        System.out.print(" Input amount: ");
                        double amount= input.nextDouble();
                        User.processDeposit(new_user,(byte)(i),amount);
                        break;
                    case 4:
                        System.out.println(" Thank you for using our service !!! ");
                        break;
                    default:
                        System.out.println(" Invalid option! ");
                        break;
                }
            }while(type!=4);
        }
    }
}