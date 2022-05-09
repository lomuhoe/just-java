package Day_0509;

class Shared{
    private double result;
    private boolean ready = true;

    public Shared() {
        super();
    }
    
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public boolean getReady() {
        return ready;
    }
}

class CalcThread extends Thread{
    private Shared shared;

    public CalcThread(Shared shared) {
        super();
        this.shared = shared;
    }

    @Override
    public void run() {
        shared.setReady(false);
        double total = 0.0;
        // 원주율을 구하는 공식
        for(long i=1 ; i<1000000000 ; i+=2){
            if(i/2%2==0)
                total += 1.0/i;
            else
                total -= 1.0/i;
        }
        shared.setResult(total*4);
        shared.setReady(true);
        System.out.println("공급자의 결과 : " + shared.getResult());
    }
}

class Consumer extends Thread{
    private Shared shared;

    public Consumer(Shared shared) {
        super();
        this.shared = shared;
    }

    @Override
    public void run() {
        while (!shared.getReady()){
            System.out.print("");
        }

        //while(true){
        //    System.out.print(shared.getReady() + " ");
        //    if(shared.getReady()) break;
        //}
        System.out.println("소비자의 결과 : " + shared.getResult());
    }
}

public class DeadLockTest01 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        CalcThread calcThread = new CalcThread(shared);
        Consumer consumer = new Consumer(shared);
        calcThread.start();
        consumer.start();
    }
}
