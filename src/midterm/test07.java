package midterm;
import java.util.*;

public class test07 {
    static int diff(char a, char b) {
        if(a>b) {
            return a-b;
        }else {
            return b-a;
        }
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner s =new Scanner(System.in);
        char a,b;
        System.out.print("문자1을 입력:");
        a=s.next().charAt(0);
        System.out.print("문자2를 입력:");
        b=s.next().charAt(0);
        System.out.printf("두 문자의 차이 ==> %d",diff(a,b));
    }
}
