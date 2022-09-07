package Day13;

import javax.swing.*;
import java.awt.*;

public class Ex03 {
    static class MyGUI extends JFrame{
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("GUI practice");
            this.setLayout(new BorderLayout());

            JToolBar toolbar = new JToolBar();
            toolbar.add(new JButton("New"));
            toolbar.add(new JButton("search"));
            toolbar.add(new JButton("save"));

            JMenuBar menuBar = new JMenuBar();

            add(toolbar, BorderLayout.NORTH);
            add(menuBar, BorderLayout.NORTH);
            JMenu file = null;
            menuBar.add((JMenu) null);
            JMenu Edit = null;
            menuBar.add(Edit);
            file = new JMenu("file");
            Edit = new JMenu("Edit");
            JMenuItem import1 = null;
            file.add(import1);
            JMenuItem save = null;
            file.add(save);
            save = new JMenuItem("save");
            JMenuItem otherFIleFormetSave = null;
            file.add(otherFIleFormetSave);
            otherFIleFormetSave = new JMenuItem("otherFileSave");
            import1 = new JMenuItem("import");



            setSize(256, 256);
            setVisible(true);

        }


    }

    public static void main(String[] args) {
        new MyGUI();
    }


}

