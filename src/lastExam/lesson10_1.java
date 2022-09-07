package lastExam;

import java.io.BufferedReader;
import java.io.FileReader;


public class lesson10_1 {
    public static void main(String[] args) throws Exception{
        FileReader fReader = new FileReader("C:\\Users\\sooo\\Desktop\\test.txt");
        BufferedReader bReader = new BufferedReader(fReader);
        String str = null;
        while((str = bReader.readLine())!= null) {
            System.out.println(str.toUpperCase());
        }
        bReader.close();
        fReader.close();
    }
}
