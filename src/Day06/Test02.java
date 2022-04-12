package Day06;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("문자열을 입력하세요");
        String str = scan.nextLine();
        String out = "";
        char ch;
        int diff = 'a'-'A';

        for(int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if(('A' <= ch) && (ch <= 'Z')){
                out += (char)(ch + diff);
            }else if (('a'<= ch) && (ch <= 'z')){
                out += (char)(ch - diff);
            }else{
                out += (char)ch;
            }
        }
        System.out.println("바뀐 문자열 출력 ==> " + out);

    }
}
