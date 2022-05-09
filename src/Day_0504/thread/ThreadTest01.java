package Day_0504.thread;

class Thread01 extends Thread {
    @Override
    public void run() {
        for(int i=0 ; i<1000 ; i++){
            System.out.print("A"+i + " ");
            if(i % 10 == 0) System.out.println();
        }
    }
}

class Thread02 extends Thread {
    @Override
    public void run() {
        for(int i=0 ; i<1000 ; i++){
            System.out.print("B" +i + " ");
            if(i % 10 == 0) System.out.println();
        }
    }
}

class ThreadB1 implements Runnable {
    @Override
    public void run() {
        char ch='A';
        for(int cnt = 0 ; cnt<=1000 ; cnt++, ch++){
            System.out.print(ch + " ");
            if(ch % 10 == 0) System.out.println();
            if(ch=='z') {
                ch = 'A'-1;
                continue;
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread01 th1 = new Thread01();
        Thread02 th2 = new Thread02();
        Thread th3 = new Thread(new ThreadB1());
        th1.setPriority(8);
        th2.setPriority(2);
        th3.setPriority(5);
        th1.start();
        th2.start();
        th3.start();
    }
}
