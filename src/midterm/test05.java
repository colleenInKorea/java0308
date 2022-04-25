package midterm;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[ ]aa = new int[4];
        int plus = 0;
        int multiple = 0;
        int i = 0;

        while( i <= 3){
            System.out.println( (i+1) + "번째 숫자를 입력하세요");
            aa[i] = scan.nextInt();
            i++;
        }

        plus = aa[0] + aa[1] + aa[2] + aa[3];
        multiple = aa[0] * aa[1] * aa[2] * aa[3];
        System.out.printf("합계 ==> %d \n", plus);
        System.out.printf("곱셈 ==> %d \n", multiple);

    }
}
