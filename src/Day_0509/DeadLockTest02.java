package Day_0509;

class Shared02{
    private double result;
    private boolean ready = true;

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

class CalcThread02 extends Thread{
    private Shared02 shared;

    public CalcThread02(Shared02 shared) {
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

        synchronized(shared){
            shared.notify();
        }
        System.out.println("공급자의 결과 : " + shared.getResult());
    }
}

class Consumer02 extends Thread{
    private Shared02 shared;

    public Consumer02(Shared02 shared) {
        super();
        this.shared = shared;
    }

    @Override
    public void run() {
        while (!shared.getReady()){
            try {
                synchronized(shared){ // shared는 동기화 메모리기때문에 동시에 사용할수없음을 선언(mutex 방식)
                    shared.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("소비자의 결과 : " + shared.getResult());
    }
}

public class DeadLockTest02 {
    public static void main(String[] args) {
        Shared02 shared = new Shared02();
        CalcThread02 calcThread = new CalcThread02(shared);
        Consumer02 consumer = new Consumer02(shared);
        calcThread.start();
        consumer.start();
    }
}
