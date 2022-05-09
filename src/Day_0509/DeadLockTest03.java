package Day_0509;

class BankAccount {
    private int balance = 1000;

    public synchronized int getBalance() { // 동기화 메소드
        return balance;
    }
    // polling, mutex, deadlock, synchronized, critical section
    public synchronized boolean clacBalance(int money) { // 동기화 메소드
        if(balance>=money && balance > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
        while(bank.getBalance()>0){
            int money = (int) (Math.random()*5+1)*100;
            bank.clacBalance(money);
            System.out.println("뺀 금액 : "+ money + ", 잔액 : " + bank.getBalance());
        }
    }
}

public class DeadLockTest03 {
    public static void main(String[] args) {
        Runnable r = new Account();
        new Thread(r).start();
        new Thread(r).start();
    }
}
