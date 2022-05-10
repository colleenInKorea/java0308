package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/idogyeong/IdeaProjects/java0308/src/Day10/untitled.txt");
        int ch;

        int i = 0;
        while((ch = fis.read())!= -1){
            System.out.print((char) ch);
        }


        fis.close();
    }
}
