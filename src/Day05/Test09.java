package Day05;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] queue = new char[5];
        int rear = 0;
        int select = 9 ;
        char carName = 'A';

        while (select != 3){
            System.out.println("<1>자동차 넣기 <2>자동차 빼기 <3> 끝 :");
            select = scan.nextInt();

            switch (select){
                case 1:
                    if (rear >= 5){
                        System.out.println("터널이 가득 차있습니다. ");
                    }else{
                        queue[rear] = carName++;
                        System.out.printf("%c 자동차가 터널에 들어감 \n" , queue[rear]);
                        rear++;
                    }
                    break;

                case 2:
                    if(rear <= 0){
                        System.out.println("빠져나갈 자동차가 없습니다. ");
                    }else{
                        System.out.printf("%c 자동차가 터널에서 빠짐 \n", queue[0]);
                        for(int i = 0; i < 4; i++){
                            queue[i] = queue[i + 1];
                        }
                        rear--;
                    }
                break;

                case 3:
                    System.out.println("현재 " + rear + "대가 터널에 존재합니다. ");
                    System.out.println("종료합니다");
                break;

                default:
                    System.out.println("잘못 입력 되었습니다. 다시 입력하세요");
            }
        }
    }
}
