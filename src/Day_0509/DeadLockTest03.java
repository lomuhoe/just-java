package Day_0509;

class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }
    public boolean clacBalance(int money) {
        if(balance>=money && balance > 0){
            balance -= money;
            return true;
        } else{
            return false;
        }
    }
}

class Account implements Runnable {
    BankAccount bank = new BankAccount();

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
}

public class DeadLockTest03 {
    public static void main(String[] args) {

    }
}
