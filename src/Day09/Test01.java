package Day09;

public class Test01 {
    public static void main(String[] args) {
        int a = 1234;
        float b = 100.12345f;
        char c = 'k';
        String s = "IT_Cookbook";

        System.out.printf("정수의 10진수 ==> %d", a);
        System.out.printf("정수의 16진수 ==> %x", a);
        System.out.printf("정수의 8진수 ==> %o", a);
        System.out.printf("실수 ==> %f", b);
        System.out.printf("실수(공학용) ==> %e", b);
        System.out.printf("문자 ==> %c", c);
        System.out.printf("문자열 ==> %s", s);
    }
}
