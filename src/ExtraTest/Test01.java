package ExtraTest;

public class Test01 {
    public int solution(int n){
        int[] money = {500, 100, 50, 10, 5, 1};
        int change = 1000-n;
        int count = 0;

        for(int i = 0; i < money.length; i++){
            if(change == 0) break;
           count += change/ money[i];
           change %= money[i];
        }
        return count;
    }

    public static void main(String[] args) {
        Test01 test = new Test01();
        System.out.println(test.solution(1));
    }
}
