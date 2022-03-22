package Day03;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("문자열을 입력하세요");
        String str = scan.next();

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println(reverse);
    }
}
