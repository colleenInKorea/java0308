package Day15_5;

import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public boolean solution(int x) throws IOException {
        boolean answer = true;

        int sum = 0;
        int a = x;
        while (a >= 1){
            sum += a % 10;
            a /= 10;
        }

        if(x % sum == 0){
            answer = true;
        }else {
            answer = false;
        }

        return answer;
    }
}
