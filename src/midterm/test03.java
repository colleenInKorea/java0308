package midterm;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        int hour, min, sec;
        Scanner scan = new Scanner(System.in);
        System.out.printf("초를 입력 : ");
        sec = scan.nextInt();

        min = sec/60;
        hour = min/60;
        sec %= 60;
        min %= 60;

        System.out.println("시간은 ==> " + hour +"시간");
        System.out.println("븐은 ==> " + min +"분");
        System.out.println("초는 ==> " + sec +"초");

    }
}
