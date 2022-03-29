package Day04;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("### 교환할 돈은?");
        int money = scan.nextInt();

        System.out.println("오백원짜리 ==>" + (money/500));
        System.out.println("백원짜리 ==>" + ((money%500)/100));
        System.out.println("오십원짜리 ==>" + (((money%500)%100)/50));
        System.out.println("십원짜리 ==>" + ((((money%500)%100)%50)/10));
        System.out.println("바꾸지 못한 돈 ==>" +((((money%500)%100)%50)%10));

    }
}
