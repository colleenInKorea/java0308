package Day13;

import javax.swing.*;
import java.awt.*;

public class Ex01 {
    static class MyGUI extends JFrame{
        MyGUI(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("GUI practice");
            // 이 위치에 버튼, 레이블, 체크박스등을 올림
            this.setLayout(new BorderLayout(10,10));

            JButton btn0 = new JButton("button1");
            this.add(btn0, BorderLayout.NORTH);

            JButton btn1 = new JButton("button2");
            this.add(btn1, BorderLayout.SOUTH);

            JButton btn2 = new JButton("button3");
            this.add(btn2 , BorderLayout.EAST);

            JButton btn3 = new JButton("button4");
            this.add(btn3, BorderLayout.WEST);

            JButton btn4 = new JButton("button5");
            this.add(btn4, BorderLayout.CENTER);

            setSize(500, 500);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
