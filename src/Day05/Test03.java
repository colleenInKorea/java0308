package Day05;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//입력 받을 글자를 scanner로 만들고 변수를 설정해서 입력 받는다.
        System.out.println("글자를 입력 하세요");
        String words = scan.nextLine();

        //입력 받은 문자열을 출력 반대순서로 출력되는 문자열을 for문을 이용하여 출력한다.
        System.out.println("입력한 문자열 : " + words);
        System.out.println("변환된 문자열을 출력합니다. ");

        for (int i = words.length()-1; i >= 0; i-- ){
            System.out.print(words.charAt(i));
        }
    }
}
