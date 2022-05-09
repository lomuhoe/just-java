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
            temp = String.format("%02d : %02d : %02d : %02d", calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE),
            calendar.get(Calendar.SECOND), calendar.get(Calendar.MILLISECOND)/10);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            target.setText(temp);
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
        int num = 0;
        
        while (true) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            target.setText(Integer.toString(num++));
        }
    }
}

class SwingThread extends JFrame{ // JFrame 이라는 창이 열림
    JTextField jtf1, jtf2, jtf3, jtf4;

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
        jtf4 = new JTextField(20); add(jtf4);
        new CountThread(jtf4).start();
        

        setVisible(true);
    }
}

public class GUIThread {
    public static void main(String[] args) {
        new SwingThread();
    }
}
