package lastExam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class lesson13_1 {
    static class myGUI extends JFrame {
        myGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("이벤트 처리");
            this.setLayout(new FlowLayout());
            JTextArea area = new JTextArea(10,10);
            this.add(area);
            this.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                    area.setText(Integer.toString(e.getX())+","+Integer.toString(e.getY()));
                }
                public void mouseEntered(MouseEvent e) {
                }
                public void mouseExited(MouseEvent e) {
                }
                public void mousePressed(MouseEvent e) {
                }
                public void mouseReleased(MouseEvent e) {
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
