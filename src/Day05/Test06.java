package Day05;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //0-9 중애서 입력한 숫자만큼 별표를 출력하는 프로그램을 작성해보시오.
        System.out.println("숫자를 여러개 입력하시오 (0-9 사이의 숫자를 겹처서 4자리 숫자를 만드시오)");
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            for (int k = 0; k < (int)ch - 48; k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
