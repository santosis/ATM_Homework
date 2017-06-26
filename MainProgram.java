import java.util.*;

class Atm {
    static Scanner sc = new Scanner(System.in);
    static double balance = 3000;
    static double amount;
    static double b = 1;
    static int password = 1357;
    static  int checkpass = 0;

    static double getAmount(){
        amount = sc.nextDouble();
        return  amount;
    }
    static double deposit(double amount){
        balance = balance + amount;
        return  balance;
    }
    static double withdraw(double amount){
        if (balance < amount){
            return b = -1;
        }
        balance = balance - amount;
        return  balance;
    }
    static double getBalance(){
        return balance;
    }
    static int checkPassword(int pass){
        if (pass == password) {checkpass = 1;}
        return checkpass;

    }

    //static int checkOrder(int order){}\
    //static int order = 0;

}

public class MainProgram {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double damount,wamount;
        int finish = 0;
        Atm a1 = new Atm();
        System.out.print("Enter Password : ");
        int pass = sc.nextInt();
        int checkpass =a1.checkPassword(pass);

        if (checkpass == 1) {

            System.out.println("Select Order No.");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Finish");

            while (finish == 0) {


                System.out.print("Order : ");
                int order = sc.nextInt();

                switch (order) {
                    case 1:
                        System.out.println("Deposit");
                        System.out.print("Amount : ");
                        damount = a1.getAmount();
                        System.out.println("Balance : " + a1.deposit(damount));
                        break;

                    case 2:
                        System.out.println("Withdraw");
                        System.out.print("Amount : ");
                        wamount = a1.getAmount();
                        double b = a1.withdraw(wamount);
                        if (b == -1) System.out.println("Your balance not enough");
                        else System.out.println("Balance : " + b);
                        break;

                    case 3:
                        System.out.println("Account Balance");
                        System.out.println("Balance : " + a1.getBalance());
                        break;

                    case 4:
                        finish = 1;
                        System.out.println("Thank you for using our service");
                        break;
                }
            }
        }
        else System.out.print("Password incorrect,try again");
    }
}
