package BetaTest;

public class Test01 {
    public static String solution(int month, int day) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] month1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int index = month - 1;
        int date = days[index] + 98 - ( days[index]-day) ;

        for (int i = 0; i < month1.length; i++) {
            if (date < 30) {
                return month1[index] + "월 " + date + "일 ";
            }
            date -= days[index++];

        }
        return "틀림";
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 18));
    }
}
