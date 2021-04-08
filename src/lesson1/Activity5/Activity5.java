package lesson1.Activity5;

public class Activity5 {
    public static void main(String[] args) {
        BankAccount bankAccount =new BankAccount();

        WithdrawAccount withdrawAccountHusband = new WithdrawAccount(bankAccount,"HusBand",15000000);
        withdrawAccountHusband.setName("husbandThread");
        withdrawAccountHusband.start();
        WithdrawAccount withdrawAccountWife = new WithdrawAccount(bankAccount,"Wife",20000000);
        withdrawAccountWife.setName("wifeThread");
        withdrawAccountWife.start();
    }
}
class BankAccount {
    public long amount = 20000000;

    public  synchronized void checkAccountBalance(String threadName , long withDrawAmount){
        System.out.print(threadName + " need: ");
        System.out.println(withDrawAmount);
        if( amount > withDrawAmount){
            System.out.println( threadName + " withdraw successful: " + withDrawAmount);
            amount = amount -withDrawAmount;
        } else {
            System.out.println( threadName + " withdraw error!");
        }
        System.out.println(threadName + " see balance: " + amount);
        System.out.println("");
    }
}

class WithdrawAccount extends Thread {
    BankAccount bankAccount1;
    String threadName1;
    long withDrawAmount1;

    public WithdrawAccount(BankAccount bankAccount1, String threadName1, long withDrawAmount1) {
        this.bankAccount1 = bankAccount1;
        this.threadName1 = threadName1;
        this.withDrawAmount1 = withDrawAmount1;
    }

    @Override
    public void run() {
        bankAccount1.checkAccountBalance(threadName1,withDrawAmount1);

    }
}