import java.util.ArrayList;

public class User {
    String user_id;
    String user_name;
    String email;
    String phone_num;
    static ArrayList <User> user_list=new ArrayList<>();
    BankingAccount new_account=new BankingAccount();

    public User(String user_id, String user_name, String email, String phone_num, BankingAccount new_account) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.phone_num = phone_num;
        this.new_account = new_account;
        user_list.add(this);
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public static ArrayList<User> getUser() {
        return user_list;
    }

    public static void setUser(ArrayList<User> user) {
        User.user_list = user;
    }

    public BankingAccount getNew_account() {
        return new_account;
    }

    public void setNew_account(BankingAccount new_account) {
        this.new_account = new_account;
    }
    public void display()
    {
        System.out.println(" User ID: ".concat(user_id));
        System.out.println(" Name: ".concat(user_name));
        System.out.println(" Email: ".concat(email));
        System.out.println(" Phone Number: ".concat(phone_num));
        System.out.println(" Balance: ".concat(String.format("%.2f",new_account.getBalance())+"$"));
        System.out.println();
    }
    public static void processDeposit(User user,byte cus_index,double amount)
    {
        BankingAccount.deposit(User.getUser_list().get(cus_index).getNew_account(),amount);
    }

    public static ArrayList<User> getUser_list() {
        return user_list;
    }

    public static void setUser_list(ArrayList<User> user_list) {
        User.user_list = user_list;
    }

    public static void processWithdraw(User user, byte cus_index, double amount)
    {
        if(BankingAccount.is_balance_not_available(User.getUser_list().get(cus_index).getNew_account(),amount))
        {
            System.out.println(" Balance Remain: ".concat(String.format("%.2f",User.getUser_list().get(cus_index).new_account.getBalance())+"$"));
            System.out.println();
            return;
        }
        BankingAccount.withdraw(User.getUser_list().get(cus_index).getNew_account(),amount);
    }
}
