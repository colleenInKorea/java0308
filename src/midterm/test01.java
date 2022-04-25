package midterm;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 계산할 값을 정하시오");
        int a = scan.nextInt();
        System.out.println("두번째 계산할 값을 정하시오");
        int b = scan.nextInt();
        System.out.println("세번째 계산할 값을 정하시오");
        int c = scan.nextInt();
        System.out.println("네번째 계산할 값을 정하시오");
        int d = scan.nextInt();

        System.out.println( a + " + " + b + " - " + c +" * " + d + " = " +(a+b-(c*d)) );
    }
}
