package lastExam;

import java.io.IOException;

public class lesson10 {
    public static void main(String[] args) throws IOException {
        String input = "";
        int key;

        System.out.println("글자 또는 숫자 ==> ");
        while ((key = System.in.read())!=13){
            if(key <= '9'&& key >= '0'){
                input += Character.toString((char) key);
            }
        }
        System.out.println("입력한 글자중 숫자는 ->" + input);

    }
}
