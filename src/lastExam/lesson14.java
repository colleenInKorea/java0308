package lastExam;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.util.Random; //랜덤 라이브러리

public class lesson14 {
    static class myGUI extends JFrame implements Runnable {
        JProgressBar bar1, bar2, bar3;
        myGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("스레드 응용");
            this.setLayout(new GridLayout(3,1,10,10));
            bar1 = new JProgressBar(); //프로그래스바 설정
            bar1.setValue(50); //초깃값
            bar1.setStringPainted(true);
            bar2 = new JProgressBar();
            bar2.setValue(10);
            bar2.setStringPainted(true);
            bar2.setForeground(Color.RED);
            bar3 = new JProgressBar();
            bar3.setValue(30);
            bar3.setForeground(Color.GREEN);
            bar3.setStringPainted(true);
            myGUI.this.add(bar1);
            myGUI.this.add(bar2);
            myGUI.this.add(bar3);
            setSize(512,256);
            setVisible(true);
        }
        public void run() {
            for(int i =0; i<100;i++) {
                try {
                    Thread.sleep(100);
                    bar1.setValue(bar1.getValue()+1);
                    bar2.setValue(bar1.getValue()+3);
                    bar3.setValue(bar1.getValue()+2);
                    bar1.setForeground(Random());
                    bar2.setForeground(Random());
                    bar3.setForeground(Random());
                } catch (Exception e) {}
            }
        }
        static Color Random() { //랜덤색상 만드는 함수
            Random rand = new Random(); //랜덤생성기 생성
            float r = rand.nextFloat(); //r,g,b에 랜덤숫자 넣기
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r,g,b); //최종 색상
            return randomColor; //반환
        }
    }
    public static void main(String[] args) {
        myGUI mygui = new myGUI();
        Thread th = new Thread(mygui);
        th.start();
    }

}
