package MainTest;

public class Test01 {
    public int solution(int num) {
        int answer = 0;
        int[] changes = {500, 100, 50, 10};
        int change = 1000- num;
        for (int i =0; i < changes.length; i++){
            if(change == 0) break;
            answer += change/changes[i];
            change %= changes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Test01 method = new Test01();
        int num1 = 160;
        System.out.println(method.solution(num1));
    }
}
