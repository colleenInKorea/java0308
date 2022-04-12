package Day06;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("문자열을 입력하세요.");
        String nomal = scan.nextLine();
        String abnomal = "";

        System.out.println("거꾸로 출력!!");
        for(int i = 0; i < nomal.length(); i++){
            abnomal += nomal.charAt(nomal.length() - (i+1));
        }
        System.out.println(abnomal);
    }
}
