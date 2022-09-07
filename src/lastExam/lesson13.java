package lastExam;
import javax.swing.*;
import java.awt.*;


public class lesson13 {
    static class myGUI extends JFrame {
        myGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("GridLayout");
            this.setLayout(new GridLayout(3,5,5,5));
            JCheckBox[] checkbox = new JCheckBox[15];
            for(int i = 0; i<15; i++) {
                checkbox[i] = new JCheckBox("체크박스"+(i+1));
                this.add(checkbox[i]);
            }
            setSize(500, 300);
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        new myGUI();
    }


}
