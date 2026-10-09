import java.util.Scanner;
class BankAccount{
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder,double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    double getBalance(){
        return balance;
    }
    void displayAccount(){
        System.out.println("Account Holder:"+accountHolder);
        System.out.println("Balance:"+balance);
    }
}

public class day14{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Account Holder:");
        String accountHolder=scan.nextLine();
        System.out.print("Initial Balance:");
        int initial=scan.nextInt();
        System.out.print("Deposit:");
        int deposit=scan.nextInt();
        System.out.print("Withdraw:");
        int withdraw=scan.nextInt();
        BankAccount acc=new BankAccount(accountHolder,initial);
        acc.deposit(deposit);
        acc.withdraw(withdraw);
        acc.displayAccount();
    }
}