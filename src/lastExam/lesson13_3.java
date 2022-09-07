package lastExam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lesson13_3 {
    static class myGUI extends JFrame {
        myGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("이벤트 처리");
            this.setLayout(new FlowLayout());
            JTextField txt = new JTextField(10);
            JTextArea area = new JTextArea(10,10);
            this.add(txt);
            this.add(area);
            txt.addKeyListener(new KeyAdapter() {
                public void keyReleased(KeyEvent e) {
                    int key = e.getKeyCode();
                    if(key == KeyEvent.VK_ENTER) {
                        String str = txt.getText();
                        area.setText(area.getText()+str.toUpperCase()+'\n');
                        txt.setText("");
                    }
                }
            });
            setSize(500, 200);
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        new myGUI();
    }

}
