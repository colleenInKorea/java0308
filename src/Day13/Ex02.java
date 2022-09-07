package Day13;

import javax.swing.*;

public class Ex02 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("no layout windows");

            this.setLayout(null);

            JButton btn0 = new JButton("button1");
            btn0.setBounds(50, 50, 70, 60);
            this.add(btn0);

            JButton btn1 = new JButton("button2");
            btn0.setBounds(80, 80, 70, 60);
            this.add(btn1);

            JButton btn2 = new JButton("button3");
            btn0.setBounds(110, 110, 70, 60);
            this.add(btn2);

            setSize(256, 256);
            setVisible(true);

        }

        public static void main(String[] args) {
            new MyGUI();
        }
    }




}
