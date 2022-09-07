package lastExam;
import java.io.BufferedReader;
import java.io.FileReader;

public class lesson10_2 {
    public static void main(String[] args) throws Exception{
        FileReader fReader  = new FileReader("C:\\Users\\sooo\\Desktop\\test.txt");
        BufferedReader bReader = new BufferedReader(fReader);
        String str = null;
        String out = "";

        while((str = bReader.readLine())!= null) {
            int count = str.length();
            int diff = 'a'-'A'; //소문자와 대문자의 차이를 diff에 저장
            for(int i = 0; i<count; i++) {
                char ch = str.charAt(i);
                if('A'<=ch && ch<='Z') { //대문자의 경우
                    out += (char) (ch +diff);
                } else if ('a'<=ch && ch<='z') { //소문자의 경우
                    out += (char) (ch - diff);
                } else { //그 외
                    out += '*';
                }
            }
            out += '\n'; //줄바꿈
        }

        System.out.println(out);

        bReader.close();
        fReader.close();
    }



}
