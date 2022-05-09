package Day_0504.thread;

class ThreadA01 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long sum = 0;
        for(int i=0 ; i<100000 ; i++){
            //System.out.print("A"+i + " ");
            //if(i % 10 == 0) System.out.println();
            sum += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("A01 경과시간 : " + (end - start) + ", 결과 : " + sum);
    }
}

class ThreadA02 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long sum = 0;
        for(int i=0 ; i<100000 ; i++){
            //System.out.print("B" +i + " ");
            //if(i % 10 == 0) System.out.println();
            sum += i;
        }
        long end = System.currentTimeMillis();

        System.out.println("A02 경과시간 : " + (end - start) + ", 결과 : " + sum);
    }
}

class ThreadB01 implements Runnable {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        char ch='A';
        for(int cnt = 0 ; cnt<=100000 ; cnt++, ch++){
            //System.out.print(ch + " ");
            //if(ch % 10 == 0) System.out.println();
            if(ch=='z') {
                ch = 'A'-1;
                continue;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("B 경과시간 : " + (end - start));
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        ThreadA01 th1 = new ThreadA01();
        ThreadA02 th2 = new ThreadA02();
        Thread thb1 = new Thread(new ThreadB01());
        thb1.start();
        //th2.start();
        //th1.start();
    }
}
