package Day10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException {
        FileReader fReader = new FileReader("/Users/idogyeong/IdeaProjects/java0308/src/Day10/sample.txt");
        BufferedReader bReader = new BufferedReader(fReader);

        String str = null;
        while((str = bReader.readLine())!= null){
            System.out.println(str);
        }

        bReader.close();
        fReader.close();
    }
}
