package Day_0509.GUIThread;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.util.Calendar;

// 현재 시간
class ClockThread extends Thread {
    JTextField target;

    public ClockThread(JTextField jField){
        this.target = jField;
    }

    @Override
    public void run() {
        Calendar calendar = null;
        String temp = null;

        while (true) {
            calendar = Calendar.getInstance();
            temp = calendar.get(Calendar.HOUR) + " : " +calendar.get(Calendar.MINUTE) + " : " + 
            calendar.get(Calendar.SECOND);
            target.setText(temp);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 시간(정수) 증가 코드
class CountThread extends Thread {
    JTextField target;

    public CountThread(JTextField jField){
        this.target = jField;
    }

    @Override
    public void run() {
        super.run();
    }
}

class SwingThread extends JFrame{ // JFrame 이라는 창이 열림
    JTextField jtf1, jtf2, jtf3;

    SwingThread(){
        super("스레드 연습"); // JFrame의 제목에 적힘
        
        super.setBounds(10, 10, 800, 600);

        super.setLayout(new FlowLayout());
        add(new JLabel("이름"));
        jtf1 = new JTextField(20); add(jtf1); 
        add(new JLabel("주소"));
        jtf2 = new JTextField("테스트", 40); add(jtf2);
        jtf3 = new JTextField(20); add(jtf3);
        new ClockThread(jtf3).start();
        

        setVisible(true);
    }
}

public class GUIThread {
    public static void main(String[] args) {
        new SwingThread();
    }
}
