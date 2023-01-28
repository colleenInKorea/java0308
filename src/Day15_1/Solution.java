package Day15_1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static long solution(long n){
        long answer = 0;
        String str = Long.toString(n);
        String[] arr = str.split("");

        Arrays.sort(arr, Collections.reverseOrder());
        str = String.join("", arr);
        answer = Long.parseLong(str);
        return  answer;
    }

}
