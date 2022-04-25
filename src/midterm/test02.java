package midterm;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int data;
        String str;

        System.out.printf("16진수를 입력하세요: ");
        str=scan.next();
        data=Integer.parseInt(str,16);

        System.out.printf("입력한 16진수는 10진수로 %d 입니다.", data);

    }
}
