package Day05;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("합계의 시작 값을 설정하시오");
        int startNumber = scan.nextInt();
        System.out.println("합계의 끝이 될 값을 설정하시오 (다만 끝이 될 값은 시작값보다 커야 합니다.)");
        int endNumber = scan.nextInt();
        System.out.println("원하는 배수를 고르시오");
        int setNumber = scan.nextInt();

        int sum = 0;

        if(startNumber > endNumber){
            System.out.println("설정값이 잘못되었습니다. 다시 시도 하십시오");
        }else {
            for (int i = startNumber; i <= endNumber; i++){
                if( i % setNumber == 0){
                   sum += i;
                }
            }
            System.out.println(startNumber + "부터 " + endNumber + "까지 " + setNumber + "배수의 합계 = " + sum);
        }


    }
}
