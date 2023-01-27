package Day14_1;

public class Solution {
    public static String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] week = { "FRI", "SAT", "SUN","MON", "TUE", "WED", "THU"};

        int total = 0;
        if(a >= 2){
            for (int i = 0; i <= a-2; i ++){
                total += month[i];
            }
            total += b-1;
        } else if (a == 1) {
            total = b-1;
        }

        answer = week[total%7];

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(5, 24));
    }
}
